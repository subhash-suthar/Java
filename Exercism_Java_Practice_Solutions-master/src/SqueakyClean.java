public class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        String result = identifier.replace(" ", "_")
                .replaceAll("\\p{C}", "CTRL")
                .replaceAll("[α-ω]", "")
                .replaceAll("[^\\p{L}\\p{P}]", "");

        char[] array = result.toLowerCase().toCharArray();

        for(char a:array) {
            if (a == '-') {
                String[] words = result.split("-");
                String camelCase = words[0];
                for (int i = 1; i < words.length; i++) {
                    camelCase += words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                }
                return camelCase;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        System.out.println(clean("_AbcĐCTRL"));
    }
}

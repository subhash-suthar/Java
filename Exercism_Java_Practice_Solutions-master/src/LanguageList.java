import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return (languages.isEmpty());
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return (languages.contains("Java") || languages.contains("Kotlin"));
    }

    public static void main (String[] args) {
        LanguageList list1 = new LanguageList();
        System.out.println(list1.isEmpty());
        System.out.println(list1.isExciting());
        list1.addLanguage("Java");
        System.out.println(list1.isExciting());
        list1.addLanguage("C++");
        list1.addLanguage("Groovy");
        list1.addLanguage("Javascript");
        System.out.println(list1.containsLanguage("Javascript"));
        System.out.println(list1.count());
        System.out.println(list1.firstLanguage());
        list1.removeLanguage("Java");
        System.out.println(list1.firstLanguage());
        System.out.println(list1.count());
        System.out.println(list1.isExciting());
        list1.addLanguage("Kotlin");
        System.out.println(list1.isExciting());
    }
}

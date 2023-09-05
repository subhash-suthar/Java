public class LogLevels {

    public static String message(String logLine) {
        String[] splitMessage = logLine.split(":");
        return(splitMessage[1].trim());
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
    }

    public static String logLevel(String logLine) {
        String[] splitMessage = logLine.split(":");
        if (splitMessage[0].contains("ERROR")){
            return "error";
        } else if (splitMessage[0].contains("INFO")){
            return "info";
        } else if (splitMessage[0].contains("WARNING")){
            return "warning";
        }
        return null;
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return (message + " (" + logLevel + ")");
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }

    public static void main (String[] args) {
        System.out.println(message("[WARNING]:   \tTimezone not set  \r\n"));
        System.out.println(logLevel("[WARNING]:   \tTimezone not set  \r\n"));
        System.out.println(reformat("[WARNING]:   \tTimezone not set  \r\n"));
    }
}

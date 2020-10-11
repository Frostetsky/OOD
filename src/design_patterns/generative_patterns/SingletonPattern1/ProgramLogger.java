package design_patterns.generative_patterns.SingletonPattern1;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is logfile. \n\n";

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String logInfo) {
        logfile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logfile);
    }
}

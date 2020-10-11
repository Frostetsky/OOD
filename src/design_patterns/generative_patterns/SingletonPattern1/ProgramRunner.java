package design_patterns.generative_patterns.SingletonPattern1;


public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        // - единственный экземпляр, равные хешкоды.
        System.out.println(System.lineSeparator());
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}

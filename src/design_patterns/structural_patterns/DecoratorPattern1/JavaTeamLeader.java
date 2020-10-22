package design_patterns.structural_patterns.DecoratorPattern1;

public class JavaTeamLeader extends DeveloperDecorator {
    public JavaTeamLeader(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "| Send week report to customer |";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}

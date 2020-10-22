package design_patterns.structural_patterns.DecoratorPattern1;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLeader(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}

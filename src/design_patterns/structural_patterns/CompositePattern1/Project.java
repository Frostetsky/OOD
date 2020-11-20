package design_patterns.structural_patterns.CompositePattern1;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer developer1 = new JavaDeveloper();
        Developer developer2 = new JavaDeveloper();
        Developer developerCpp = new CppDeveloper();

        team.addDeveloper(developer1);
        team.addDeveloper(developer2);
        team.addDeveloper(developerCpp);

        team.writeCode();
    }
}

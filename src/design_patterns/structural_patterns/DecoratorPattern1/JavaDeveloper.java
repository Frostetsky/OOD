package design_patterns.structural_patterns.DecoratorPattern1;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "| Write Java code... |";
    }
}

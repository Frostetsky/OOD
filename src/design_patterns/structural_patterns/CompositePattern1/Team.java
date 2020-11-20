package design_patterns.structural_patterns.CompositePattern1;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public boolean removeDeveloper(Developer developer) {
        return developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team create Project.");
        developers.forEach(Developer::writeCode);
    }
}

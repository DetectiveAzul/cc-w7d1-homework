package attractions;

import interfaces.IEnjoyable;
import persons.Visitor;

import java.util.ArrayList;

public abstract class Attraction implements IEnjoyable {
    private String name;
    private int funRating;
    ArrayList<Visitor> visitors;

    public Attraction(String name, int funRating) {
        this.name = name;
        this.funRating = funRating;
        this.visitors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getFunRating() {
        return funRating;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

    public int getNumberOfVisitors() {
        return visitors.size();
    }
}

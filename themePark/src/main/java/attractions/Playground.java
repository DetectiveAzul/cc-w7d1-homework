package attractions;


import interfaces.IRestrictable;
import persons.Visitor;

public class Playground extends Attraction implements IRestrictable {
    private int maxAge;

    public Playground(String name, int funRating) {
        super(name, funRating);
        this.maxAge = 15;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= maxAge;
    }
}

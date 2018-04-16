package stalls;

import interfaces.IRestrictable;
import persons.Visitor;

public class TobaccoStall extends Stall implements IRestrictable {
    private int minAge;

    public TobaccoStall(String name, String ownerName, String parkingSpot, int funRating) {
        super(name, ownerName, parkingSpot, funRating);
        this.minAge = 18;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= minAge;
    }
}

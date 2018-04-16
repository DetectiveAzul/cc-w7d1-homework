package stalls;

import interfaces.IRestrictable;
import persons.Visitor;

public class IceCreamStall extends Stall implements IRestrictable {
    public IceCreamStall(String name, String ownerName, String parkingSpot, int funRating, double price) {
        super(name, ownerName, parkingSpot, funRating, price);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.isHadMeal();
    }
}

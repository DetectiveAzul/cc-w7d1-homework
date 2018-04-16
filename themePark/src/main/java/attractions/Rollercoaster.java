package attractions;

import interfaces.IChargeable;
import interfaces.IRestrictable;
import persons.Visitor;

public class Rollercoaster extends Attraction implements IRestrictable, IChargeable {
    private int minAge;
    private double minHeight;
    private double price;

    public Rollercoaster(String name, int funRating, double price) {
        super(name, funRating);
        this.minAge = 12;
        this.minHeight = 1.45;
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= minAge && visitor.getHeight() >= 1.45);
    }

    public double getPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) return (price/2);
        return price;
    }
}

package attractions;

import interfaces.IChargeable;
import persons.Visitor;

public class Dodgems extends Attraction implements IChargeable {
    private double price;

    public Dodgems(String name, int funRating, double price) {
        super(name, funRating);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) return (price/2);
        return price;
    }
}

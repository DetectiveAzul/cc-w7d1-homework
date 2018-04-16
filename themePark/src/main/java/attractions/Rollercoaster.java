package attractions;

import interfaces.IChargeable;
import interfaces.IRestrictable;
import persons.Visitor;

public class Rollercoaster extends Attraction implements IRestrictable, IChargeable {
    private int minAge;
    private double minHeight;
    private double price;
    private double speed;

    public Rollercoaster(String name, int funRating, double speed, double price) {
        super(name, funRating);
        this.minAge = 12;
        this.minHeight = 1.45;
        this.speed = speed;
        this.price = price + speed;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= minAge && visitor.getHeight() >= 1.45 && !visitor.isHadMeal());
    }

    public double getPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) return (price/2);
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public void changeSpeed(double speed) {
        this.speed += speed;
        this.price += speed;
    }
}

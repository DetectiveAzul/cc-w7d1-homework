package stalls;

import interfaces.IChargeable;
import interfaces.IEnjoyable;
import persons.Visitor;

public abstract class Stall implements IEnjoyable, IChargeable {
    private String name;
    private String ownerName;
    private String parkingSpot;
    private int funRating;
    private double price;

    public Stall(String name, String ownerName, String parkingSpot, int funRating, double price) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = funRating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getFunRating() {
        return funRating + 2;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public double priceFor(Visitor visitor) {
        return price;
    }

}

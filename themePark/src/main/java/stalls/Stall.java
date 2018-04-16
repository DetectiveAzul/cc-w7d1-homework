package stalls;

import interfaces.IEnjoyable;

public abstract class Stall implements IEnjoyable {
    private String name;
    private String ownerName;
    private String parkingSpot;
    private int funRating;

    public Stall(String name, String ownerName, String parkingSpot, int funRating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = funRating;
    }

    public String getName() {
        return name;
    }

    public int getFunRating() {
        return funRating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

}

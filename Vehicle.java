package main.java;
public class Vehicle {
    private double lon;
    private double lat;
    private String bookingLink;
    private int availableQuantity;
    private float hourCost;
    private String powerType;
    private ArrivalPoint arrivalPoint;//da popolare nel caso dei bus, riguarda L'UML, non è obbligatorio, da far capire che ha senso
    public MobilityType type;

    public ArrivalPoint getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(ArrivalPoint arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public MobilityType getType() {
        return type;
    }

    public void setType(MobilityType type) {
        this.type = type;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getBookingLink() {
        return bookingLink;
    }

    public void setBookingLink(String bookingLink) {
        this.bookingLink = bookingLink;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public float getHourCost() {
        return hourCost;
    }

    public void setHourCost(float hourCost) {
        this.hourCost = hourCost;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }
}

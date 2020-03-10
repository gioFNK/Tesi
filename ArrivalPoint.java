package main.java;

public class ArrivalPoint {
    private double lon;
    private double lat;
    private String label;
    private long nominalArrivalTime;

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getNominalArrivalTime() {
        return nominalArrivalTime;
    }

    public void setNominalArrivalTime(long nominalArrivalTime) {
        this.nominalArrivalTime = nominalArrivalTime;
    }
}

package main.java;

public class BusVehicle extends Vehicle implements ProviderVehicle {
    private String linea;
    private String capolinea;
    private double lon;
    private double lat;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getCapolinea() {
        return capolinea;
    }

    public void setCapolinea(String capolinea) {
        this.capolinea = capolinea;
    }

    @Override
    public double getLon() {
        return lon;
    }

    @Override
    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public double getLat() {
        return lat;
    }

    @Override
    public void setLat(double lat) {
        this.lat = lat;
    }
}

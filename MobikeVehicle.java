package main.java;
public class MobikeVehicle extends Vehicle implements ProviderVehicle  {
    private String distId;
    private Float distX;
    private Float distY;
    private String distance;
    private String bikeIds;
    private int bike_type;
    private int operateType;

    public String getDistId() {
        return distId;
    }

    public void setDistId(String distId) {
        this.distId = distId;
    }

    public Float getDistX() {
        return distX;
    }

    public void setDistX(Float distX) {
        this.distX = distX;
    }

    public Float getDistY() {
        return distY;
    }

    public void setDistY(Float distY) {
        this.distY = distY;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getBikeIds() {
        return bikeIds;
    }

    public void setBikeIds(String bikeIds) {
        this.bikeIds = bikeIds;
    }

    public int getBike_type() {
        return bike_type;
    }

    public void setBike_type(int bike_type) {
        this.bike_type = bike_type;
    }

    public int getOperateType() {
        return operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }
}

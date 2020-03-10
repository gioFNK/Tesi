package main.java;
public abstract class Adapter {
    private String name;
    private MobilityType mobilityType;
    private String description;
    protected abstract Vehicle adapt(ProviderVehicle v);
}

package main.java;
public class SimulatedBusProviderAdapter extends Adapter {
    private BusVehicle managedVehicle;
    @Override
    protected Vehicle adapt(ProviderVehicle v) {
        return managedVehicle;
    }
}

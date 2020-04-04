package main.java;

import java.io.IOException;
import java.util.ArrayList;

public class ApiGateway {
    public ArrayList<Vehicle> invoke(Adapter adapter, ArrivalPoint arrivalPoint, StartingPoint startingPoint) throws IOException {
        ArrayList<Vehicle> vehicles=new ArrayList<>();

        if(adapter instanceof MobikeAdapter) {
            try {
                MobikeAdapter mobikeAdapter=(MobikeAdapter)adapter;
                vehicles = mobikeAdapter.getVehicles(arrivalPoint, startingPoint);
            } catch (IOException exeption) {
                System.out.println("Errore nella connessione");
            }
        }
        if(adapter instanceof SimulatedBusProviderAdapter) {
            SimulatedBusProviderAdapter busAdapter=(SimulatedBusProviderAdapter) adapter;
            vehicles = busAdapter.getVehicles(arrivalPoint, startingPoint);
        }
        return vehicles;
    }
}

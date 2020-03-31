package main.java;

import java.io.IOException;
import java.util.ArrayList;

public class ApiRest {
    public ArrayList<Vehicle> call(String request, ArrivalPoint arrivalPoint, StartingPoint startingPoint) throws IOException {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        if(request.equals("https://mymobikeadapter")){
            MobikeAdapter mobikeAdapter=new MobikeAdapter();

            try {
                vehicles = mobikeAdapter.getVehicles(arrivalPoint, startingPoint);
            }
            catch (IOException exeption){
                System.out.println("Errore nella connessione");
            }
        }
        if(request.equals("https://mybusapi")){
            SimulatedBusProviderAdapter simulatedBusProviderAdapter=new SimulatedBusProviderAdapter();
            vehicles = simulatedBusProviderAdapter.getVehicles(arrivalPoint, startingPoint);
        }
        return vehicles;
    }
}

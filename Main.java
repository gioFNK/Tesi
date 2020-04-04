package main.java;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String [ ] args) throws IOException {
        //Build Scenario
        ArrayList<InfomobilityProvider> infomobilityProviders=new ArrayList<>();
        InfomobilityProvider mobike= new InfomobilityProvider();
        MobikeAdapter mobikeAdapter = new MobikeAdapter();
        mobike.setName("Mobike");
        mobike.setProviderType(ProviderType.API);
        mobike.setAdapter(mobikeAdapter);
        infomobilityProviders.add(mobike);
        InfomobilityProvider busAPI= new InfomobilityProvider();
        busAPI.setName("busAPI");
        SimulatedBusProviderAdapter busProviderAdapter=new SimulatedBusProviderAdapter();
        busAPI.setAdapter(busProviderAdapter);
        busAPI.setProviderType(ProviderType.API);
        infomobilityProviders.add(busAPI);
        //
        ArrivalPoint arrivalPoint=new ArrivalPoint();
        arrivalPoint.setLabel("San Marco");
        arrivalPoint.setLon(11.256215);
        arrivalPoint.setLat(43.7786954);

        StartingPoint startingPoint=new StartingPoint();
        startingPoint.setLabel("Santa Maria Novella");
        startingPoint.setLon(11.2285176);
        startingPoint.setLat(43.7780011);

        ArrayList<Vehicle> vehicles=new ArrayList<>();
        for(int i=0; i<infomobilityProviders.size();i++)
        {
            vehicles.addAll(infomobilityProviders.get(i).getVehicles(arrivalPoint,startingPoint));
        }
        for(int i = 0; i < vehicles.size(); i ++) {
            System.out.println(vehicles.get(i).getLat());
            System.out.println(vehicles.get(i).getLon());
        }
    }
}

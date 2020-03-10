package main.java;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String [ ] args) throws IOException {

        InfomobilityProvider mobike= new InfomobilityProvider();
        mobike.setAdapterRemoteURI("https://app.mobike.com/api/nearby/v4/");
        mobike.setName("Mobike");
        mobike.setProviderType(ProviderType.API);

        ArrivalPoint arrivalPoint=new ArrivalPoint();
        arrivalPoint.setLabel("test");
        arrivalPoint.setLon(11.194516);
        arrivalPoint.setLat(43.767300);

        MobikeAdapter mobikeAdapter=new MobikeAdapter(arrivalPoint);
        ArrayList<Vehicle> mobikes = mobikeAdapter.getVehicles();
        for(int i = 0;i < mobikes.size();i ++){
            System.out.println(mobikes.get(i).getLat());
            System.out.println(mobikes.get(i).getLon());
        }
    }
}

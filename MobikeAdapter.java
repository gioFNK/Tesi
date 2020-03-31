package main.java;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import static main.java.MobilityType.BIKE;

public class MobikeAdapter extends Adapter {
    private static final String uri="https://app.mobike.com/api/nearby/v4/nearbyBikeInfo?";

    @Override
    protected Vehicle adapt(ProviderVehicle v) {
        MobikeVehicle mv=(MobikeVehicle)v;
        Vehicle vehicle=new Vehicle();
        vehicle.setAvailableQuantity(1);
        vehicle.setBookingLink("");
        vehicle.setHourCost(1);
        vehicle.setPowerType("Super ecologico");
        vehicle.setLat(mv.getDistX());
        vehicle.setLon(mv.getDistY());
        vehicle.setType(BIKE);
        return vehicle;
    }
    public ArrayList<Vehicle> getVehicles(ArrivalPoint arrivalPoint, StartingPoint startingPoint) throws IOException {
        ArrayList<Vehicle> vehicles= new ArrayList<>();
        ArrayList<MobikeVehicle> managedVechicles = new ArrayList<>();
        try {
            URL url = new URL(uri + "latitude=" + String.valueOf(startingPoint.getLat()) + "&longitude=" + String.valueOf(startingPoint.getLon()));
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            final JSONObject obj = new JSONObject(content.toString());
            final JSONArray bikes = obj.getJSONArray("bike");

            final int n = bikes.length();

            for (int i = 0; i < n; ++i) {
                final JSONObject bike = bikes.getJSONObject(i);

                MobikeVehicle mobikeVehicle = new MobikeVehicle();
                mobikeVehicle.setBikeIds(bike.getString("bikeIds"));
                mobikeVehicle.setDistX(bike.getFloat("distX"));
                mobikeVehicle.setDistY(bike.getFloat("distY"));
                mobikeVehicle.setDistance(bike.getString("distance"));
                mobikeVehicle.setDistId(bike.getString("distId"));
                mobikeVehicle.setBike_type(bike.getInt("biketype"));
                mobikeVehicle.setOperateType(bike.getInt("operateType"));
                mobikeVehicle.type = BIKE;
                managedVechicles.add(mobikeVehicle);
            }
            in.close();
            con.disconnect();
        }
        catch (IOException exception){
            System.out.println("Errore nella connessione");
        }
        //parte di adattamento
        for(int i=0;i<managedVechicles.size();i++){
            vehicles.add(adapt(managedVechicles.get(i)));
            vehicles.get(i).setArrivalPoint(arrivalPoint);
        }
        return vehicles;
    }
};

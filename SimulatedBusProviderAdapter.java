package main.java;

import java.util.ArrayList;

import static main.java.MobilityType.BUS;

public class SimulatedBusProviderAdapter extends Adapter {
    @Override
    protected Vehicle adapt(ProviderVehicle v)
    {
        BusVehicle bv=(BusVehicle) v;
        Vehicle vehicle=new Vehicle();
        vehicle.setAvailableQuantity(30);//media posti liberi su un autobus
        vehicle.setBookingLink("");
        vehicle.setHourCost((float) 1.50);//costo di un biglietto
        vehicle.setPowerType("Benzina");
        vehicle.setLat(bv.getLat());
        vehicle.setLon(bv.getLon());
        vehicle.setType(BUS);
        return vehicle;
    }
    public ArrayList<Vehicle> getVehicles(ArrivalPoint arrivalPoint, StartingPoint startingPoint){
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        ArrayList<BusVehicle> busVehicles=new ArrayList<>();
        BusVehicle busVehicle = new BusVehicle();
        busVehicle.setCapolinea("Le Cure - Via Boccaccio/ Via Faentina - Salviati FS");
        busVehicle.setLinea("1");
        busVehicle.setLat(43.776447);
        busVehicle.setLon(11.2456794);
        busVehicles.add(busVehicle);
        busVehicle.setCapolinea("Coverciano - Via Novelli");
        busVehicle.setLinea("6");
        busVehicle.setLat(43.776447);
        busVehicle.setLon(11.2456794);
        busVehicles.add(busVehicle);
        busVehicle.setCapolinea("Fiesole - Vinandro Osteria");
        busVehicle.setLinea("7");
        busVehicle.setLat(43.776447);
        busVehicle.setLon(11.2456794);
        busVehicles.add(busVehicle);
        busVehicle.setCapolinea("Salviatino");
        busVehicle.setLinea("11");
        busVehicle.setLat(43.776447);
        busVehicle.setLon(11.2456794);
        busVehicles.add(busVehicle);
        busVehicle.setCapolinea("Il Girone / Rocca Tedalda 03 - Conservatorio Di Musica Luigi Cherubini");
        busVehicle.setLinea("14");
        busVehicle.setLat(43.776447);
        busVehicle.setLon(11.2456794);
        busVehicles.add(busVehicle);
        for(int i=0;i<busVehicles.size();i++)
        {
            vehicles.add(adapt(busVehicles.get(i)));
            vehicles.get(i).setArrivalPoint(arrivalPoint);
        }
        return vehicles;
    }
}

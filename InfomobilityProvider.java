package main.java;

import java.io.IOException;
import java.util.ArrayList;

public class InfomobilityProvider {
    private String name;
    private String adapterRemoteURI;
    private ProviderType providerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdapterRemoteURI() {
        return adapterRemoteURI;
    }

    public void setAdapterRemoteURI(String adapterRemoteURI) {
        this.adapterRemoteURI = adapterRemoteURI;
    }

    public ProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType;
    }
    public ArrayList<Vehicle> getVehicles(ArrivalPoint arrivalPoint, StartingPoint startingPoint) throws IOException {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        switch (providerType){
            case API:
                //normalmente si farebbe una chiamata rest alla remote uri, qui la simuliamo con una classe
                ApiRest apiRest=new ApiRest();
                try {
                    vehicles=apiRest.call(adapterRemoteURI, arrivalPoint,startingPoint);
                }
                catch (IOException exception){
                    System.out.println(exception.getMessage());
                }
            case EMBEDDED_VIEW:
                //
            case REDIRECT_LINK:
                //
        }
        return vehicles;
    }
}

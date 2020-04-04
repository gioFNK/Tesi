package main.java;

import java.io.IOException;
import java.util.ArrayList;

public class InfomobilityProvider {
    private String name;
    private ProviderType providerType;
    private Adapter adapter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType;
    }

    public Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public ArrayList<Vehicle> getVehicles(ArrivalPoint arrivalPoint, StartingPoint startingPoint) throws IOException {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        switch (providerType){
            case API:
                //normalmente si farebbe una chiamata rest alla remote uri, qui la simuliamo con una classe
                ApiGateway apiGateway =new ApiGateway();
                try {
                    vehicles= apiGateway.invoke(this.adapter, arrivalPoint,startingPoint);
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

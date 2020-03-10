package main.java;

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
}

package org.edgexfoundry.support.domain.notifications;

public class AzureChannel extends Channel {

    private String addressable;

    public AzureChannel(){
        super.type = ChannelType.AZURE;
    }

    public String getAddressable() {
        return addressable;
    }

    public void setAddressable(String addressable) {
        this.addressable = addressable;
    }
}

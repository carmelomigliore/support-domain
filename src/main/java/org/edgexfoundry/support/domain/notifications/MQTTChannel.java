package org.edgexfoundry.support.domain.notifications;

public class MQTTChannel extends Channel {

    private String addressable;

    public MQTTChannel(){
        super.type = ChannelType.MQTT;
    }

    public String getAddressable() {
        return addressable;
    }

    public void setAddressable(String addressable) {
        this.addressable = addressable;
    }

}

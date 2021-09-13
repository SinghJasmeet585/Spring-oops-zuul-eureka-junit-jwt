package com.niit.ibm;

import java.util.HashMap;
import java.util.Map;

public class ClientDAO implements ClientInterface {

    HashMap<String, Client> mapClient = new HashMap<>();

    @Override
    public void saveClientDetails(Client client) {
        mapClient.put(client.getPassportNumber(), client);
    }

    @Override
    public Client searchClientPassport(String passport) {
        if (mapClient.containsKey(passport)) {
            for (Map.Entry values :
                    mapClient.entrySet()) {
                if(passport.equals(values.getKey())){
                    Object value = values.getValue();
                    return (Client) value;
                }
            }
        }
        //Client client = mapClient.get(passport);
        //return client;
        return null;
    }

    public HashMap<String, Client> getMapClient() {
        return mapClient;
    }

}

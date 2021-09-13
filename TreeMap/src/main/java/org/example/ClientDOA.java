package org.example;

import java.util.Map;
import java.util.TreeMap;

public class ClientDOA implements ClientInterface {

    TreeMap<String, Client> mapClient = new TreeMap<>();

    @Override
    public void saveClientDetails(Client client) {
        mapClient.put(client.getClientID(), client);
    }

    @Override
    public Client searchClientID(String clientID) {
        if (mapClient.containsKey(clientID)) {
            for (Map.Entry values :
                    mapClient.entrySet()) {
                if(clientID.equals(values.getKey())){
                    Object value = values.getValue();
                    return (Client) value;
                }
            }
        }
        //Client client = mapClient.get(clientID);
       // return client;
        return null;
    }

    public TreeMap<String, Client> getMapClient() {
        return mapClient;
    }
}

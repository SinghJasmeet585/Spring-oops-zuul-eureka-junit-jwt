package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Client> listClient = new ArrayList<>();
        System.out.println("Enter the number of clients : ");
        int number = Integer.parseInt(reader.readLine());
        while (number-- != 0) {
            Client tempClient = new Client();
            System.out.println("Enter the details of the client : ");
            tempClient.setClientName(reader.readLine());
            tempClient.setEmail(reader.readLine());
            tempClient.setPassportNumber(reader.readLine());
            listClient.add(tempClient);
        }

        HashMap<String, Client> mapClient = new HashMap<>();
        for (Client client :
                listClient) {
            mapClient.put(client.getPassportNumber(), client);
        }

        System.out.println("Enter the passport number of the client to be searched : ");
        String searchPassportNumber = reader.readLine();
        for (Map.Entry<String, Client> entry :
                mapClient.entrySet()) {
            if (mapClient.containsKey(searchPassportNumber)) {
                System.out.println("Client Details : ");
                System.out.println(entry.getValue().getClientName() +
                        "--" + entry.getValue().getEmail() + "--"
                        + entry.getValue().getPassportNumber());
                return;
            }
        }

        System.out.println("Client Not Found");
    }
}

package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ClientDOA clientDAO = new ClientDOA();
        System.out.println("Enter the number of clients : ");
        int number = Integer.parseInt(reader.readLine());
        for(int i=0;i<number;i++){
            Client client = new Client();
            System.out.println("Enter details of client-" + (i+1) +" ");
            client.setClientID(reader.readLine());
            client.setClientName(reader.readLine());
            client.setEmail(reader.readLine());
            client.setPassportNumber(reader.readLine());
            clientDAO.saveClientDetails(client);
        }
        TreeMap<String, Client> clientDetails = clientDAO.getMapClient();
        System.out.println(clientDetails);
        System.out.println("Enter the id of the client to be searched : ");
        Client client = clientDAO.searchClientID(reader.readLine());
        if (client!=null)
            System.out.println(client);
        else
            System.out.println("No client details found");
    }
}

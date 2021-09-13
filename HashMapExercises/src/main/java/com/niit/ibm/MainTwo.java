package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ClientDAO clientDAO = new ClientDAO();
        System.out.println("Enter the number of clients : ");
        int number = Integer.parseInt(reader.readLine());
        for(int i=0;i<number;i++){
            Client client = new Client();
            System.out.println("Enter details of client-" + (i+1) +" ");
            client.setClientName(reader.readLine());
            client.setEmail(reader.readLine());
            client.setPassportNumber(reader.readLine());
            clientDAO.saveClientDetails(client);
        }
        HashMap<String, Client> clientDetails = clientDAO.getMapClient();
        System.out.println(clientDetails);
        System.out.println("Enter the passport number to get client details");
        Client client = clientDAO.searchClientPassport(reader.readLine());
        if (client!=null)
            System.out.println(client);
        else
            System.out.println("No client details found");
    }
}

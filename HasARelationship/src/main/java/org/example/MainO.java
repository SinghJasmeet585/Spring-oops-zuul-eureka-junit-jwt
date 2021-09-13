package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;

public class MainO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of address");
        int addressCount = Integer.parseInt(reader.readLine());

        ArrayList<Address> addressList = new ArrayList<>();
        while (addressCount-- != 0) {
            System.out.println("Enter address - ");
            Address address = new Address();
            address.setCity(reader.readLine());
            address.setState(reader.readLine());
            address.setPinCode(Integer.parseInt(reader.readLine()));
            addressList.add(address);
        }

        System.out.println("Enter employee details");
        Employee employee = new Employee();
        employee.setId(reader.readLine());
        employee.setName(reader.readLine());
        //Has A
        employee.setAddressesList(addressList);

        System.out.format("%-15s %-15s \n", "ID", "Name");
        System.out.format("%-15s %-15s \n\n", employee.getId(), employee.getName());

        int count = 1;
        System.out.println("List of Address : \n");
        System.out.format("%-15s %-15s %-15s %-15s \n", "S.No.", "City", "State", "Pincode");
        for (Address address :
                addressList) {
            System.out.format("%-15s %-15s %-15s %-15s \n", count, address.getCity(), address.getState(), address.getPinCode());
            count++;
        }

    }
}

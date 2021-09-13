package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BuffferReaderDemo {
    public static void main(String[] args) throws IOException {
        File filePath = new File("data/ipl.txt");
        BufferedReader reader = null;
        EmployeeDAO employeeDAO = new EmployeeDAO();
        if (filePath.exists()) {
            try {
                reader = new BufferedReader(new FileReader(filePath));
                String line;

                /*
                line = reader.readLine();
                System.out.println("Row 1 -> " + line);
                line = reader.readLine();
                System.out.println("Row 2 -> " + line);
                line = reader.readLine();
                System.out.println("Row 3 -> " + line);

                 */

                //reader.mark(0);
                //reader.reset();

                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(",");
                    Employee employee = new Employee();
                    employee.setId(Integer.parseInt(split[0]));
                    employee.setName(split[1]);
                    employee.setMobile(Long.parseLong(split[2]));
                    employee.setSalary(Double.parseDouble(split[3]));
                    employeeDAO.saveEmployeeDetails(employee);
                }
                ArrayList<Employee> allEmployeeDetails = employeeDAO.getALlEmployeeDetails();
                System.out.format("%-10s %-10s %-10s %-10s \n","ID","Name","Mobile","Salary");
                for (Employee emp:
                    allEmployeeDetails ) {
                    System.out.format("%-10s %-10s %-10s %-10s \n",emp.getId(),emp.getName(),emp.getMobile(),emp.getSalary());
                }



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                reader.close();
            }
        } else {
            System.out.println("File Not Found");
        }
    }
}

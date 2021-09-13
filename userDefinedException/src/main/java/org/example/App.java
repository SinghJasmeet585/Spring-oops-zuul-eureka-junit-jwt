package org.example;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util .Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String phone = "95gfshgTY@@";
        //length
        System.out.println(phone.matches("[0-9]{10}"));
        //start with 9 / 8 / 7
        System.out.println(phone.matches("[987]{1}[0-9]{9}"));
        // should not end with zero
        System.out.println(phone.matches("[0-9]{9}[1-9]"));
        // 5 to 9 characters long
        System.out.println(phone.matches("[0-9]{10}"));
        //


        String str = "ab";
        System.out.println(str.matches("[abc]*"));
        System.out.println("ccc".matches("[abc]*"));
        System.out.println("ccc232WW".matches("[a-zA-Z0-9]*"));
        System.out.println("ccc232WW".matches("[^a-zA-Z0-9]*"));
        System.out.println("cccWW".matches("[0-9]*"));




        /*
        // Java 8 local date
        // pattern for java 8 local date

        //like SimpleDateFormat
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter the date");
        String dateString = reader.readLine();

        LocalDate anyDate=LocalDate.parse(dateString,dateTimeFormatter);
        long between = ChronoUnit.DAYS.between(anyDate, LocalDate.now());
        System.out.println(between);

        //store the list of employee details

        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.println("enter number of employees");
        int noOfEmployee=Integer.parseInt(reader.readLine());
        for (int i=0; i<noOfEmployee; i++){
            String[] split = reader.readLine().split(",");
            Employee emp=new Employee();
            emp.setId(Integer.parseInt(split[0]));
            emp.setName(split[1]);
            emp.setMobile(Long.parseLong(split[2]));
            emp.setSalary(Double.parseDouble(split[3]));
            employeeList.add(emp);
        }
        System.out.println("List of Employees = ");
        for (Employee emp: employeeList) {
            System.out.println(emp.toString());
        }


        /*
        System.out.println("Enter the date format dd/mm/yyyy");
        String dateString =reader.readLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try{
            //string to date
            Date parseDate = sdf.parse(dateString);
            System.out.println(parseDate);

            //date to string
            String formatString=sdf.format(parseDate);
            System.out.println(formatString);
        }catch(ParseException ex){
            System.out.println("dd/MM/yyyy");
        }



        System.out.println("Enter your age = ");
        int age = Integer.parseInt(reader.readLine());
        try {
            if (age < 18 || age > 26) {
                throw new InvalidAgeException("Enter age between 18 and 26");
            }
            System.out.println("Age Accepted");
        }
        catch(InvalidAgeException ex){
            System.out.println("Age not accepted");
            System.out.println("Message -> " + ex.toString());
        }

         */
    }
}

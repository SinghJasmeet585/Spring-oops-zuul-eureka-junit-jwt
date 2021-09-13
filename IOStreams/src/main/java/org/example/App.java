package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        File file = new File("data/ipl.txt");

        System.out.println("File present = " + file.exists());
        System.out.println("Read = " + file.canRead());
        System.out.println("Write = " + file.canWrite());


        //Byte streams
        FileInputStream reader = null;
        FileOutputStream writer = null;
        try {


            reader = new FileInputStream(file);
            int read;
            while ((read=reader.read()) != -1){
                System.out.println((char) read);
            }

            writer = new FileOutputStream(file);
            String str = "Welcome to Stackroute";
            //Encodes the string into sequence of bytes
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            writer.write(bytes);

            /*

            System.out.println("ASCII " + read);
            System.out.println("Typecast " + (char) read);
            read = reader.read();
            System.out.println("ASCII " + read);
            System.out.println("Typecast " + (char) read);


             */



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException ex) {

            }
        }
    }
}

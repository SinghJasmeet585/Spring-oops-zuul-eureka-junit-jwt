package org.example;

import java.io.*;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        File filePath = new File("data/ipl.txt");
        BufferedWriter writer = null;
        if (filePath.exists()) {
            try {

                writer = new BufferedWriter(new FileWriter(filePath));
                writer.write("Hi Welcome back");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                writer.close();
            }
        } else {
            System.out.println("File Not Found");
        }
    }
}

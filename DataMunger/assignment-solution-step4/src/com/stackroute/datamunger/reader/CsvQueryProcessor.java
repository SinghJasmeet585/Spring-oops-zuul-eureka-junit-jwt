package com.stackroute.datamunger.reader;

import java.io.*;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

    public String fileName;

    /*
     * Parameterized constructor to initialize filename. As you are trying to
     * perform file reading, hence you need to be ready to handle the IO Exceptions.
     */


    public CsvQueryProcessor(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        this.fileName = fileName;
    }

    /*
     * Implementation of getHeader() method. We will have to extract the headers
     * from the first line of the file.
     */

    @Override
    public Header getHeader() throws IOException {
        //FileReader fileReader = new FileReader(fileName);
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String readHeader = fileReader.readLine();
        // populate the header object with the String array containing the header names
        String[] head = readHeader.split(",");
        Header header = new Header();
        header.setHeaders(head);
        return header;


    }

    /**
     * This method will be used in the upcoming assignments
     */
    @Override
    public void getDataRow() {

    }

    /*
     * Implementation of getColumnType() method. To find out the data types, we will
     * read the first line from the file and extract the field values from it. In
     * the previous assignment, we have tried to convert a specific field value to
     * Integer or Double. However, in this assignment, we are going to use Regular
     * Expression to find the appropriate data type of a field. Integers: should
     * contain only digits without decimal point Double: should contain digits as
     * well as decimal point Date: Dates can be written in many formats in the CSV
     * file. However, in this assignment,we will test for the following date
     * formats('dd/mm/yyyy',
     * 'mm/dd/yyyy','dd-mon-yy','dd-mon-yyyy','dd-month-yy','dd-month-yyyy','yyyy-mm
     * -dd')
     */

    @Override
    public DataTypeDefinitions getColumnType() throws IOException {
        FileReader readFile;
        try {
            readFile = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            readFile = new FileReader("data/ipl.csv");
        }
        BufferedReader fileReader = new BufferedReader(readFile);
        String fileHeader = fileReader.readLine();
        //System.out.println(strHeader);
        String fileFirstRow = fileReader.readLine();
        // System.out.println(strFirstRow);
        String[] fileColumns = fileFirstRow.split(",",18);
        String[] dataTypeArray = new String[fileColumns.length];
        int count = 0;

        // [0-2][0-9] | [3][0-1] --> Day

        for (String value : fileColumns) {


            // checking for Integer
            if (value.matches("[0-9]+")) {
                dataTypeArray[count] = "java.lang.Integer";
                count++;
            }
            // checking for floating point numbers
            else if (value.matches("[0-9]+(\\.[0-9]+)")) {
                dataTypeArray[count] = "java.lang.Float";
                count++;
            }
            // checking for date format dd/mm/yyyy
            else if (value.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format mm/dd/yyyy
            else if (value.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format dd-mon-yy
            else if (value.matches("[0-9]{2}-[a-z]{3}-[0-9]{2}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format dd-mon-yyyy
            else if (value.matches("[0-9]{2}-[a-z]{3}-[0-9]{4}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format dd-month-yy
            else if (value.matches("[0-9]{2}-[a-z]{3,9}-[0-9]{2}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format dd-month-yyyy
            else if (value.matches("[0-9]{2}-[a-z]{3,9}-[0-9]{4}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }
            // checking for date format yyyy-mm-dd
            else if (value.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
                dataTypeArray[count] = "java.util.Date";
                count++;
            }

            else if (value.isEmpty()){
                dataTypeArray[count] = "java.lang.Object";
                count++;
            }

            else{
                dataTypeArray[count] = "java.lang.String";
                count++;
            }
        }
        DataTypeDefinitions dataTypeDefinitions = new DataTypeDefinitions();
        dataTypeDefinitions.setDataType(dataTypeArray);
        return dataTypeDefinitions;


    }

}

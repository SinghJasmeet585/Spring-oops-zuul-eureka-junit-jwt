package com.stackroute.datamunger.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

    private String fileName;

    // Parameterized constructor to initialize filename
    public CsvQueryProcessor(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
    }

    /*
     * Implementation of getHeader() method. We will have to extract the headers
     * from the first line of the file.
     * Note: Return type of the method will be Header
     */

    @Override
    public Header getHeader() throws IOException {

        // read the first line
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String readHeader = fileReader.readLine();
        // populate the header object with the String array containing the header names
        String[] head = readHeader.split(",");
        Header header = new Header();
        header.setHeader(head);
        return header;
    }

    /**
     * getDataRow() method will be used in the upcoming assignments
     */

    @Override
    public void getDataRow() {

    }

    /*
     * Implementation of getColumnType() method. To find out the data types, we will
     * read the first line from the file and extract the field values from it. If a
     * specific field value can be converted to Integer, the data type of that field
     * will contain "java.lang.Integer", otherwise if it can be converted to Double,
     * then the data type of that field will contain "java.lang.Double", otherwise,
     * the field is to be treated as String.
     * Note: Return Type of the method will be DataTypeDefinitions
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
        String[] fileColumns = fileFirstRow.split(",", 18);
        String[] dataTypeArray = new String[fileColumns.length];
        int count = 0;
        for (String values : fileColumns) {
            if (values.matches("[0-9]+")) {
                dataTypeArray[count] = "java.lang.Integer";
                count++;
            } else if (values.matches(".*[a-zA-Z]*.")) {
                dataTypeArray[count] = "java.lang.String";
                count++;
            } else if (values.isEmpty()) {
                dataTypeArray[count] = "java.lang.String";
                count++;
            } else {
                dataTypeArray[count] = "java.lang.Double";
                count++;
            }
        }
        //dataTypeArray[17] = "java.lang.String"; // 18th field is empty
        DataTypeDefinitions dataTypeDefinitions = new DataTypeDefinitions();
        dataTypeDefinitions.setColumns(dataTypeArray);
        return dataTypeDefinitions;
    }
}

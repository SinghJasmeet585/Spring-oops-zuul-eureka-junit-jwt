package com.stackroute.datamunger.query;

import java.util.Arrays;

public class DataTypeDefinitions {

    /*
     * This class should contain a member variable which is a String array, to hold
     * the data type for all columns for all data types and should override
     * toString() method as well.
     */
    private String[] dataType;

    public DataTypeDefinitions() {
    }

    public void setDataType(String[] dataType) {
        this.dataType = dataType;
    }

    public String[] getDataTypes() {
        return dataType;
    }

    @Override
    public String toString() {
        return "DataTypeDefinitions{" +
                "dataType=" + Arrays.toString(dataType) +
                '}';
    }
}

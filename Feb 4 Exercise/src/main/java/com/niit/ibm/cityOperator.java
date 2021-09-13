package com.niit.ibm;

public class cityOperator {
    private String city;
    private String operator;
    private String cityName;

    @Override
    public String toString() {
        return "cityOperator{" +
                "city='" + city + '\'' +
                ", operator='" + operator + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCity() {
        return city;
    }

    public String getOperator() {
        return operator;
    }

    public String getCityName() {
        return cityName;
    }
}

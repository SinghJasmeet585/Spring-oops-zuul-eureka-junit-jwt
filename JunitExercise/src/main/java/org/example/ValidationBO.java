package org.example;

public class ValidationBO {
    public String validateBookingId(String id){
        if (id == null || id=="0" || id.isEmpty() || id.equals(" ")){
            return "Invalid booking Id";
        }
        if(id.matches("[0-9]*")){
            return "Valid booking Id";
        }else{
            return "Invalid booking Id";
        }
    }
}

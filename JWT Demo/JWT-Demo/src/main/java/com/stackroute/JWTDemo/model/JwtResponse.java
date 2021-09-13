package com.stackroute.JWTDemo.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -809089898798798789L;
    private final String jwttoken;


    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return this.jwttoken;
    }
}

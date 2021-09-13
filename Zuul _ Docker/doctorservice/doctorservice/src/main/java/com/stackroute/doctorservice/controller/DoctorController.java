package com.stackroute.doctorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/getDoctor")
    public String getDoctorService(){
        return "Doctor Microservice";
    }

    @GetMapping("/welcome/{name}")
    public String getDoctorService(@PathVariable String name){
        return "Welcome" + name + "Doctor Services";
    }

}

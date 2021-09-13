package com.stackroute.diagnosisService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosisController {

    @GetMapping("/getDiagnosis")
    public String getDiagnosisService(){
        return "Diagnosis Microservice";
    }

    @GetMapping("/welcome/{name}")
    public String getDiagnosisService(@PathVariable String name){
        return "Welcome" + name + "Diagnosis Services";
    }
}

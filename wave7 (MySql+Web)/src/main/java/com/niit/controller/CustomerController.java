package com.niit.controller;

import com.niit.model.Customer;
import com.niit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ctrl+shift+a

@RestController // handle all incoming request and it will send to service layer based on URL
// @RestController -> @Controller + @ResponseBody
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String getHomePage() {
        return "Welcome to SpringBoot";
    }

    @GetMapping("/home")
    public String getAdminHomePage() {
        return "Hi Admin -- Welcome";
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "Contact page";
    }

    @PostMapping("/insertCustomerDetails")
    public String insertCustomerDetails(@RequestBody Customer customer){
        //incoming request --> HTTp body -> object
        String message=customerService.addCustomerDetails(customer);
        return message;
    }

    @GetMapping("/getAllCustomerDetails")
    public List<Customer> getCustomerDetails(){
        List<Customer> allCustomerDetails=customerService.getAllCustomerDetails();
        return allCustomerDetails;
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(name = "id") int customerid){
        String deleteMessage = customerService.deleteCustomer(customerid);
        return deleteMessage;
    }

    @PutMapping("/updateCustomer/{id}")
    public  String updateCustomer(@PathVariable(value = "id")int id,@RequestBody Customer customer)
    {
        String updateMessage=customerService.updateCustomer(customer,id);
        return updateMessage;
    }


}

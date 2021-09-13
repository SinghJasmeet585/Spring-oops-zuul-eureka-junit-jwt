package com.niit.service;

import com.niit.dao.CustomerRepository;
import com.niit.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component -> make java class as a bean ->bean will be send to the IoC container
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomerDetails(Customer customer){
        Customer customerInsert = customerRepository.save(customer); //insert sql command
        if(customerInsert!=null){
            return "insertion done successfully";
        }else{
            return "insertion failed";
        }
    }

    public List<Customer> getAllCustomerDetails(){
        List<Customer> all = customerRepository.findAll(); // select * from customer
        return all;
    }

    public String deleteCustomer(int id){
        customerRepository.deleteById((id)); // select * from customer
        return "Delete method called check database";
    }

    public String updateCustomer(Customer customer,int id)
    {
        if(customerRepository.findById(id).isPresent())
        {
            Customer oldCustomer=customerRepository.findById(id).get();
            oldCustomer.setName(customer.getName());
            oldCustomer.setEmail(customer.getEmail());
            oldCustomer.setCity(customer.getCity());
            oldCustomer.setSalary(customer.getSalary());
            customerRepository.save(oldCustomer);
            return "SuccessFully Updated";
        }
        else
            return "data not present";
    }

}

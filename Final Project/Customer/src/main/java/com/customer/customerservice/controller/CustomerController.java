package com.customer.customerservice.controller;

import com.customer.customerservice.service.CustomerService;
import commonproject.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.PUT)
    public ResponseEntity<Customer> update(@RequestBody Customer customer) {
        Customer customerUpdate = customerService.update(customer);
        return ResponseEntity.ok().body(customerUpdate);
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public Customer viewCustomer(@RequestParam(value = "mobileNumber")String mobileNumber){
        return customerService.findCustomerByMobileNNumber(mobileNumber);
    }
}

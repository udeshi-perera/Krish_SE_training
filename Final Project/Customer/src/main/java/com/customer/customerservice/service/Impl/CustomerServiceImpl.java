package com.customer.customerservice.service.Impl;

import com.customer.customerservice.repository.CustomerRepository;
import com.customer.customerservice.service.CustomerService;
import commonproject.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        //Optional<Customer> optionalCustomer=this.customerRepository.findById(Integer.valueOf(customer.getMobileNumber()));
        customer.setId(customer.getId());
        Customer customerUpdate = customerRepository.save(customer);
        return customerUpdate;
    }

    @Override
    public Customer findCustomerByMobileNNumber(String mobileNumber) {
        return customerRepository.findByMobileNumber(mobileNumber);
    }
}

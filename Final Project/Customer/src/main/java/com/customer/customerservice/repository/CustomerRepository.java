package com.customer.customerservice.repository;

import commonproject.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByMobileNumber(String mobileNumber);
}

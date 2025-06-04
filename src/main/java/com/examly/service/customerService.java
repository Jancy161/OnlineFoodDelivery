package com.examly.service;

import com.examly.entity.Customer;
import com.examly.exception.EmailAlreadyRegisteredException;

public interface CustomerService {
    boolean createCustomer(Customer customer) throws EmailAlreadyRegisteredException;
}

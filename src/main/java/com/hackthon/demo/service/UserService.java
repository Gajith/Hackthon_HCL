package com.hackthon.demo.service;

import com.hackthon.demo.exception.NotFoundException;
import com.hackthon.demo.jpa.Customer;
import com.hackthon.demo.model.UserDto;
import com.hackthon.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer get(long id) throws NotFoundException {
        Optional<Customer> customer= customerRepository.findById(id);
        if(!customer.isPresent()){
            throw new NotFoundException("Customer is not found for perticular given id"+id);
        }
       return customer.get();
    }

    public UserDto
    create(UserDto userDto) {
        Customer customer = new Customer(userDto.getName());

        Customer savedCustomer = customerRepository.save(customer);
         userDto.setCustomerId(savedCustomer.getCustomerId());
         return userDto;
    }
}

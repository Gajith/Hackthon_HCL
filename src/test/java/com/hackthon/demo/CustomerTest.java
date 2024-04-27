package com.hackthon.demo;

import com.hackthon.demo.exception.NotFoundException;
import com.hackthon.demo.jpa.Customer;
import com.hackthon.demo.model.UserDto;
import com.hackthon.demo.repository.CustomerRepository;
import com.hackthon.demo.service.UserService;
import lombok.SneakyThrows;
import org.assertj.core.api.Fail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CustomerTest {

    @Autowired
    UserService userService;

    @Test
    @SneakyThrows
    public void testGetCustomerByIdExists(){
       Customer user = userService.get(1);
       assert(user.getCustomerId()!=null);
    }

    @Test
    @SneakyThrows
    public void testGetCustomerByIdNotExists(){
        //assert(user.getCustomerId()!=null);


        assertThrows(NotFoundException.class, () ->  userService.get(2)); //
    }

    @Test
    public void testCreateCustomer() {
        UserDto userDto = new UserDto("testUser");

        UserDto user = userService.create(userDto);
        assert (user.getCustomerId() != null);
    }







}

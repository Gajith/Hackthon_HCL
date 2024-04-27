package com.hackthon.demo.repository;
import com.hackthon.demo.jpa.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("CustomerRepository")
public interface  CustomerRepository extends JpaRepository<Customer, Long> {



}

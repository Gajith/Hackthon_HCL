package com.hackthon.demo.jpa;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PersistenceContexts;
import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Adjust generation strategy if needed
    private Long customerId;

    @Column(nullable = false)
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }
// Getters and Setters (omitted for brevity)
}
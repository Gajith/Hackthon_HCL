package com.hackthon.demo.jpa;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
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
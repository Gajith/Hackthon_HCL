package com.hackthon.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class PortfolioDto {
    private Long portfolioId;

    private String name;

    private BigDecimal portfolioValue; // Use BigDecimal for monetary values

    private String portfolioNumber;

    private String strategy;

    private String performance;
}

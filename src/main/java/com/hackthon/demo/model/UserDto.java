package com.hackthon.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class UserDto {

    private Long customerId;
    private String name;

    List<PortfolioDto> portfolioDtoList;

    public UserDto(String name) {
        this.name = name;
    }
}

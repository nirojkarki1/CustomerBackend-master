package com.example.CustomerBackend.dto;

import com.example.CustomerBackend.enitity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderRequest {
    @Autowired
    private Customer customer;


}

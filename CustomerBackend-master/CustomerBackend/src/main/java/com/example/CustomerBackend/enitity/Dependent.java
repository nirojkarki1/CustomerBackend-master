package com.example.CustomerBackend.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class Dependent {
    @Id
    private int dID;
    private String name;
    private String  email;
    private String gender;
    private int cp_fk;

    public Dependent() {
    }
}

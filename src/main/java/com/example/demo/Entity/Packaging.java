package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Packaging {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int packageId;
    private String supplier;
    private String location;
    private String date; // = LocalDate.now();

}

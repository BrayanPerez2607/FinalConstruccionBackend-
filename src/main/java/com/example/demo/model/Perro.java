package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "perro")
@Data
public class Perro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long perroId;

    private String dogName;
    private String ownerName;
    private int dogAge;
    private String dogGender;
    private String dogBreed;
    private String ownerEmail;
    private String ownerPhone;
    private String ownerIdentification;
}

package com.sau.jwt.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column (name ="brand")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="plate")
    private String plate;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Rental> rental;
}

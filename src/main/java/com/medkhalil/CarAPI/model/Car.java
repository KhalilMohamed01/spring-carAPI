package com.medkhalil.CarAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="car")
public class Car {

    @Id
    private Integer id;

    private String marque;
    private String model;
    private Integer annee;
    private String energie;
    private Integer kilometrage;
    private String boiteVitesse;
    private Integer nbPlace;
    private Integer nbPorte;
    private Integer prix;
}
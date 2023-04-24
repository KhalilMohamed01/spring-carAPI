package com.medkhalil.CarAPI.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

@Table(name="data")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // AUTO_INCREMENT ( You can use SEQUENCE as a GenerationType for a sequence-based generation)
    @Column(name = "id", unique = true,nullable = false)
    private Integer id;

    @ManyToOne
    private Marque marque;

    @ManyToOne
    private Modele modele;
    
    @Column(name = "annee")
    private Integer annee;
    
    @Column(name = "energie")
    private String energie;
    
    @Column(name = "kilometrage")
    private Integer kilometrage;
    
    @Column(name = "boiteVitesse")
    private String boiteVitesse;
    
    @Column(name = "nbPlace")
    private Integer nbPlace;
    
    @Column(name = "nbPorte")
    private Integer nbPorte;
    
    @Column(name = "prix")
    private Integer prix;
}
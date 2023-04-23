package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medkhalil.CarAPI.model.Modele;

public interface ModelRepository extends JpaRepository<Modele,Integer> {

}

package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medkhalil.CarAPI.model.Marque;

public interface MarqueRepository extends JpaRepository<Marque,Integer> {

}

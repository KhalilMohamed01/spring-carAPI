package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medkhalil.CarAPI.model.Car;

public interface MySqlRepository extends JpaRepository<Car,Integer> {
    
}

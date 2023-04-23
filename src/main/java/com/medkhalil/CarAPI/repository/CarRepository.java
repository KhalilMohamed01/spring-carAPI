package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medkhalil.CarAPI.model.Car;

public interface CarRepository  extends JpaRepository<Car,Integer> {

}

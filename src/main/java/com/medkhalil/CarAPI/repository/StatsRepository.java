package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.model.Car;

public interface StatsRepository extends JpaRepository<Car,Integer> {

}

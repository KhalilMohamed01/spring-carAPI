package com.medkhalil.CarAPI.service;

import java.util.List;
import java.util.Optional;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;


public interface  CarService {
	public void save(Car car);
    public void deleteByID(Integer id );
    public List<Car> findAll() ;
    public  Car findByID(Integer id );
	public Optional<Car> findById(Integer id);
	public void deleteById(Integer id);
	public Car updateCar(Integer id, CreateOrUpdateReq createOrUpdateReq);
	public Car createCar(CreateOrUpdateReq createOrUpdateReq);
	
}

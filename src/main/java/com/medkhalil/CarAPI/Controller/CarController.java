package com.medkhalil.CarAPI.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.service.CarService;

@RequestMapping (value = "Cars")
@CrossOrigin("*")
@RestController
public class CarController {
    

    
    @Autowired
    CarService carService;
    
  
    @GetMapping("/get-all-cars")
    public List<Car> getAllCars(){
        return carService.findAll();
    }

    @GetMapping("/get-car/{identity}")
    public Car getSingleCar(@PathVariable("identity") Integer id){
        return carService.findById(id).get();
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){

        if(!carService.findById(id).equals(Optional.empty())){
        	carService.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update/{id}")
    public Car updateCar(@PathVariable("id") Integer id,@RequestBody CreateOrUpdateReq createOrUpdateReq){
        return carService.updateCar(id, createOrUpdateReq);
    }

    @PostMapping("/add")
    public void create(@RequestBody CreateOrUpdateReq createOrUpdateReq){
    	 carService.createCar(createOrUpdateReq);
  
    }
}

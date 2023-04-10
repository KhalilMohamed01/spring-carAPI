package com.medkhalil.CarAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.repository.MySqlRepository;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

@RestController
public class CarController {
    
    @Autowired
    MySqlRepository mySqlRepository;

    @GetMapping("/get-all-cars")
    public List<Car> getAllCars(){
        return mySqlRepository.findAll();
    }

    @GetMapping("/get-car/{identity}")
    public Car getSingleCar(@PathVariable("identity") Integer id){
        return mySqlRepository.findById(id).get();
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){
        if(!mySqlRepository.findById(id).equals(Optional.empty())){
            mySqlRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

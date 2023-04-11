package com.medkhalil.CarAPI.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PutMapping("/update/{id}")
    public Car updateCar(@PathVariable("id") Integer id,@RequestBody Map<String,String> body){
        Car current = mySqlRepository.findById(id).get();
        current.setPrix(Integer.parseInt(body.get("prix")));
        current.setKilometrage(Integer.parseInt(body.get("kilometrage")));
        current.setModel(body.get("model"));
        mySqlRepository.save(current);
        return current;
    }
}

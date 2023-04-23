package com.medkhalil.CarAPI.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.model.Modele;
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
    public Car updateCar(@PathVariable("id") Integer id,@RequestBody Car voiture){
    	// Start by doing a check on the request validity. if the request is wrong. try to raise custom exceptions   
        Car current = mySqlRepository.findById(id).get();
        current.setPrix(voiture.getPrix());
        current.setKilometrage(voiture.getKilometrage());
        current.setModele(voiture.getModele());
        current.setMarque(voiture.getMarque());
        mySqlRepository.save(current);
        return current;
    }

    @PostMapping("/add")
    public Car create(@RequestBody Map<String,String> body){
        String marque = body.get("marque");
        String model = body.get("model");
        Integer kilometrage = Integer.parseInt(body.get("kilometrage"));

        Car newCar = new Car();

        return mySqlRepository.save(newCar);
    }
}

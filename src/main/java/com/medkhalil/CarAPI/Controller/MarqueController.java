package com.medkhalil.CarAPI.controller;

import java.util.List;
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

import com.medkhalil.CarAPI.model.Marque;
import com.medkhalil.CarAPI.service.MarqueService;

@RequestMapping (value = "Marques")
@CrossOrigin("*")
@RestController
public class MarqueController {
	
	@Autowired
 	MarqueService marqueService;
    
  
    @GetMapping("/get-all-brands")
    public List<Marque> getAllBrands(){
        return marqueService.findAll();
    }

    @GetMapping("/get-brand/{identity}")
    public Marque getSingleCar(@PathVariable("identity") Integer id){
        return marqueService.findById(id).get();
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){

        if(!marqueService.findById(id).equals(Optional.empty())){
        	marqueService.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update/{id}")
    public Marque updateModele(@PathVariable("id") Integer id,@RequestBody Marque marque){
        return marqueService.updateMarque(id, marque);
    }

    @PostMapping("/add")
    public void create(@RequestBody Marque marque){
    	marqueService.save(marque);
  
    }
}

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

import com.medkhalil.CarAPI.model.Modele;
import com.medkhalil.CarAPI.service.ModeleService;

@RequestMapping (value = "Models")
@CrossOrigin("*")
@RestController
public class ModeleController {
	
	 	@Autowired
	 	ModeleService modeleService;
	    
	  
	    @GetMapping("/get-all-models")
	    public List<Modele> getAllModels(){
	        return modeleService.findAll();
	    }

	    @GetMapping("/get-model/{identity}")
	    public Modele getSingleCar(@PathVariable("identity") Integer id){
	        return modeleService.findById(id).get();
	    }

	    @DeleteMapping("/remove/{id}")
	    public boolean deleteRow(@PathVariable("id") Integer id){

	        if(!modeleService.findById(id).equals(Optional.empty())){
	        	modeleService.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    @PutMapping("/update/{id}")
	    public Modele updateModele(@PathVariable("id") Integer id,@RequestBody Modele modele){
	        return modeleService.updateModele(id, modele);
	    }

	    @PostMapping("/add")
	    public void create(@RequestBody Modele modele){
	    	 modeleService.save(modele);
	  
	    }
}

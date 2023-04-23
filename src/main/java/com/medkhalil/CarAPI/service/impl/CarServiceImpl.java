package com.medkhalil.CarAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medkhalil.CarAPI.helpers.mappersImpl.MapRequestObjToEntity;
import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.model.Marque;
import com.medkhalil.CarAPI.model.Modele;
import com.medkhalil.CarAPI.repository.CarRepository;
import com.medkhalil.CarAPI.service.CarService;
import com.medkhalil.CarAPI.service.MarqueService;
import com.medkhalil.CarAPI.service.ModeleService;

@Service
public class CarServiceImpl implements CarService{
	
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	ModeleService modeleService;
	    
	@Autowired
	MarqueService marqueService;
	    
	@Autowired
	MapRequestObjToEntity mapper;
	
	
	
	@Override
	public void save(Car car) {
		carRepository.save(car);
		
	}

	@Override
	public void deleteByID(Integer id) {
		carRepository.deleteById(id);
		
	}

	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}

	@Override
	public Car findByID(Integer id) {
		return carRepository.findById(id).get();
	}

	@Override
	public Optional<Car> findById(Integer id) {
		return carRepository.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		 carRepository.deleteById(id);
		
	}

	@Override
	public Car updateCar(Integer id, CreateOrUpdateReq createOrUpdateReq) {
        Car car = mapper.toCarEntity(createOrUpdateReq);
        car.setId(carRepository.findById(id).get().getId());
        car.setPrix(createOrUpdateReq.getPrix());
        car.setKilometrage(createOrUpdateReq.getKilometrage());
        Marque marque = marqueService.findById(createOrUpdateReq.getMarque_id()).get();
        Modele modele = modeleService.findById(createOrUpdateReq.getModele_id()).get();
        car.setModele(modele);
        car.setMarque(marque);
        return carRepository.save(car);
	}

	@Override
	public Car createCar(CreateOrUpdateReq createOrUpdateReq) {
		// build car object
    	Car car = new Car();
    	Marque marque = marqueService.findById(createOrUpdateReq.getMarque_id()).get();
        Modele modele = modeleService.findById(createOrUpdateReq.getModele_id()).get();
        car.setModele(modele);
        car.setMarque(marque);
    	car.setPrix(createOrUpdateReq.getPrix());
    	car.setKilometrage(createOrUpdateReq.getKilometrage());
    	car.setAnnee(createOrUpdateReq.getAnnee());
    	car.setEnergie(createOrUpdateReq.getEnergie());
    	car.setBoiteVitesse(createOrUpdateReq.getBoiteVitesse());
		return carRepository.save(car);
	}

}

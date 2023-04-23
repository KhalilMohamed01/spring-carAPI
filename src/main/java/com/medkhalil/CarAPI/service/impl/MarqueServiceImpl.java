package com.medkhalil.CarAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medkhalil.CarAPI.model.Marque;
import com.medkhalil.CarAPI.repository.MarqueRepository;
import com.medkhalil.CarAPI.service.MarqueService;

@Service
public class MarqueServiceImpl implements MarqueService{

	@Autowired
	MarqueRepository marqueRepo;
	
	@Override
	public void save(Marque marque) {
		marqueRepo.save(marque);
		
	}

	@Override
	public void deleteByID(Integer id) {
		marqueRepo.deleteById(id);
		
	}

	@Override
	public List<Marque> findAll() {
		return marqueRepo.findAll();
	}

	@Override
	public Marque findByID(Integer id) {
		return marqueRepo.findById(id).get();
	}

	@Override
	public Optional<Marque> findById(Integer id) {
		return marqueRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		 marqueRepo.deleteById(id);
	}

	@Override
	public Marque updateMarque(Integer id, Marque marque) {
		    Marque current = marqueRepo.findById(id).get() ;
		    current.setMarque_label(marque.getMarque_label());
	        return marqueRepo.save(current);
	}

}

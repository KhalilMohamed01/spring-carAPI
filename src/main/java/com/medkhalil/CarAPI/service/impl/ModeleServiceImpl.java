package com.medkhalil.CarAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medkhalil.CarAPI.model.Modele;
import com.medkhalil.CarAPI.repository.ModelRepository;
import com.medkhalil.CarAPI.service.ModeleService;

@Service
public class ModeleServiceImpl implements ModeleService {
	
	@Autowired
	ModelRepository modeleRepo;
	
	@Override
	public void save(Modele modele) {
		modeleRepo.save(modele);
		
	}
	
	@Override
	public void deleteByID(Integer id) {
		modeleRepo.deleteById(id);
		
	}

	@Override
	public List<Modele> findAll() {
		return modeleRepo.findAll();
	}

	@Override
	public Modele findByID(Integer id) {
		return modeleRepo.findById(id).get();
	}

	@Override
	public Optional<Modele> findById(Integer id) {
		return modeleRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		modeleRepo.deleteById(id);
	}

	@Override
	public Modele updateModele(Integer id, Modele modele) {
			Modele current = modeleRepo.findById(id).get() ;
			current.setModele_label(modele.getModele_label());
	        return modeleRepo.save(current);
	}
}

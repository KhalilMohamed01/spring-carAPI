package com.medkhalil.CarAPI.service;

import java.util.List;
import java.util.Optional;

import com.medkhalil.CarAPI.model.Marque;


public interface MarqueService {
	public void save(Marque marque);
    public void deleteByID(Integer id );
    public List<Marque> findAll() ;
    public  Marque findByID(Integer id );
	public Optional<Marque> findById(Integer id);
	public void deleteById(Integer id);
	public Marque updateMarque(Integer id, Marque marque);
}

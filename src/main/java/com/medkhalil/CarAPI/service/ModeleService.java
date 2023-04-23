package com.medkhalil.CarAPI.service;

import java.util.List;
import java.util.Optional;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.model.Modele;

public interface ModeleService {
	public void save(Modele modele);
    public void deleteByID(Integer id );
    public List<Modele> findAll() ;
    public  Modele findByID(Integer id );
	public Optional<Modele> findById(Integer id);
	public void deleteById(Integer id);
	public Modele updateModele(Integer id, Modele modele);

}

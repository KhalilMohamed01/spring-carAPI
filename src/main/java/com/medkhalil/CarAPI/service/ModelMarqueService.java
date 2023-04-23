package com.medkhalil.CarAPI.service;

import java.util.List;
import java.util.Optional;

import com.medkhalil.CarAPI.model.ModelMarque;
import com.medkhalil.CarAPI.model.ModelMarquePk;

public interface ModelMarqueService {
	public void save(ModelMarque car);
    public void deleteByID(ModelMarquePk id );
    public List<ModelMarque> findAll() ;
    public  ModelMarque findByID(ModelMarquePk id );
	public Optional<ModelMarque> findById(ModelMarquePk id);
	public void deleteById(ModelMarquePk id);
}

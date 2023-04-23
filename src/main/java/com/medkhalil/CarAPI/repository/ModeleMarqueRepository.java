package com.medkhalil.CarAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medkhalil.CarAPI.model.ModelMarque;
import com.medkhalil.CarAPI.model.ModelMarquePk;

public interface ModeleMarqueRepository extends JpaRepository<ModelMarque,ModelMarquePk> {

}

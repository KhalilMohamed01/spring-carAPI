package com.medkhalil.CarAPI.model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ModelMarquePk   {
	
	@ManyToOne
	private Marque marque;
	
	@ManyToOne
	private Modele modele;
}

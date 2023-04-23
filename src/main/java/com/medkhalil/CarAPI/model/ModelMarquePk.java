package com.medkhalil.CarAPI.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ModelMarquePk  implements Serializable {
	
	@ManyToOne
	private Marque marque;
	
	@ManyToOne
	private Modele modele;
}

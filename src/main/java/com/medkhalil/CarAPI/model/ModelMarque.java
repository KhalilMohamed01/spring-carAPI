package com.medkhalil.CarAPI.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="MODELEMARQUE")
public class ModelMarque {
	

	@EmbeddedId
	private ModelMarquePk pk;
	
	private String anneeDeSortie;
}

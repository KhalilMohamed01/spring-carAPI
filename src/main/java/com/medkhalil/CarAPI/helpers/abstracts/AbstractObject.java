package com.medkhalil.CarAPI.helpers.abstracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractObject {
	
	private Integer marque_id;

    private Integer modele_id;
    
    private Integer annee;
    
    private Integer prix;
}

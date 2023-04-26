package com.medkhalil.CarAPI.helpers.requestObjects;

import com.medkhalil.CarAPI.helpers.abstracts.AbstractObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatsRequestObject extends AbstractObject{
	
	    private String energie;

	    private String boiteVitesse;

}

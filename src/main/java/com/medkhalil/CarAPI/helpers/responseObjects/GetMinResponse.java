package com.medkhalil.CarAPI.helpers.responseObjects;

import com.medkhalil.CarAPI.helpers.abstracts.AbstractObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetMinResponse extends AbstractObject {
	
	private Integer minimumPrice;
}

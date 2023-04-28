package com.medkhalil.CarAPI.helpers.responseObjects;

import java.math.BigDecimal;

import com.medkhalil.CarAPI.helpers.abstracts.AbstractObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllStatsResponse extends AbstractObject {
	private BigDecimal avgPrice;
	private Integer minimumPrice;
	private Integer maximumPrice;
}

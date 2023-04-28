package com.medkhalil.CarAPI.helpers.responseObjects;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AllStatsSqlReqModel {
	private BigDecimal avgPrice;
	private Integer maximumPrice;
	private Integer minimumPrice;
	
}

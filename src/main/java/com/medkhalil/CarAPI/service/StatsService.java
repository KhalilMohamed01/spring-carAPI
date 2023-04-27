package com.medkhalil.CarAPI.service;

import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMinResponse;

public interface StatsService {
	
	public GetMinResponse getMin(StatsRequestObject stats);
}

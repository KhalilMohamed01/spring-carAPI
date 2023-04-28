package com.medkhalil.CarAPI.service;

import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAllStatsResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAvgResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMaxResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMinResponse;

public interface StatsService {
	
	public GetMinResponse getMin(StatsRequestObject stats);
	public GetMaxResponse getMax(StatsRequestObject stats);
	public GetAvgResponse getAvg(StatsRequestObject stats);
	public GetAllStatsResponse getAllStats(StatsRequestObject stats);
}

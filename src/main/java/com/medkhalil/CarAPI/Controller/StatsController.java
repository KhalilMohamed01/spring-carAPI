package com.medkhalil.CarAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAllStatsResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAvgResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMaxResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMinResponse;
import com.medkhalil.CarAPI.service.StatsService;

@RequestMapping (value = "Stats")
@CrossOrigin("*")
@RestController
public class StatsController {
	
	@Autowired
	StatsService statsService;
	
    @PostMapping("/getMin")
    public GetMinResponse getMin(@RequestBody StatsRequestObject statsRequestObject){
    		return statsService.getMin(statsRequestObject);
    }
    
    @PostMapping("/getMax")
    public GetMaxResponse getMax(@RequestBody StatsRequestObject statsRequestObject){
    		return statsService.getMax(statsRequestObject);
    }
    
    @PostMapping("/getAvg")
    public GetAvgResponse getAvg(@RequestBody StatsRequestObject statsRequestObject){
    		return statsService.getAvg(statsRequestObject);
    }
    
    @PostMapping("/getAllStats")
    public GetAllStatsResponse getAllStats(@RequestBody StatsRequestObject statsRequestObject){
    		return statsService.getAllStats(statsRequestObject);
    }
}

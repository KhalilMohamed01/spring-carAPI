package com.medkhalil.CarAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMinResponse;
import com.medkhalil.CarAPI.service.StatsService;

@RequestMapping (value = "Stats")
@CrossOrigin("*")
@RestController
public class StatsController {
	
	@Autowired
	StatsService statsService;
	
    @PostMapping("/getMin")
    public GetMinResponse create(@RequestBody StatsRequestObject statsRequestObject){
    		return statsService.getMin(statsRequestObject);

  
    }
}

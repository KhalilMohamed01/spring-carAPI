package com.medkhalil.CarAPI.helpers.mappers;

import org.mapstruct.Mapper;

import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;

@Mapper(componentModel = "spring")
public interface MapRequestObjToEntityInterface {
	
	public CreateOrUpdateReq  toCreateOrUpdateReq(Car car);
	
	public Car  toCarEntity(CreateOrUpdateReq createOrUpdateReq);
}

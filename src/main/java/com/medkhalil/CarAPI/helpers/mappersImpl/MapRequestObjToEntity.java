package com.medkhalil.CarAPI.helpers.mappersImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medkhalil.CarAPI.helpers.mappers.MapRequestObjToEntityInterface;
import com.medkhalil.CarAPI.helpers.requestObjects.CreateOrUpdateReq;
import com.medkhalil.CarAPI.model.Car;
import com.medkhalil.CarAPI.model.Marque;
import com.medkhalil.CarAPI.model.Modele;
import com.medkhalil.CarAPI.service.MarqueService;
import com.medkhalil.CarAPI.service.ModeleService;

@Component
public class MapRequestObjToEntity implements MapRequestObjToEntityInterface {

    @Autowired
    ModeleService modeleService;
    
    @Autowired
    MarqueService marqueService;
    
	@Override
	public CreateOrUpdateReq toCreateOrUpdateReq(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	public Car toCarEntity(CreateOrUpdateReq createOrUpdateReq) {
    	Car car = new Car();
    	Marque marque = marqueService.findById(createOrUpdateReq.getMarque_id()).get();
        Modele modele = modeleService.findById(createOrUpdateReq.getModele_id()).get();
        car.setModele(modele);
        car.setMarque(marque);
    	car.setPrix(createOrUpdateReq.getPrix());
    	car.setKilometrage(createOrUpdateReq.getKilometrage());
    	car.setAnnee(createOrUpdateReq.getAnnee());
    	car.setEnergie(createOrUpdateReq.getEnergie());
    	car.setBoiteVitesse(createOrUpdateReq.getBoiteVitesse());
    	return car;
	}

}

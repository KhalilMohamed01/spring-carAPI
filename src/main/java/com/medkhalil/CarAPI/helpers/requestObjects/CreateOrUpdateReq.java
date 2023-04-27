package com.medkhalil.CarAPI.helpers.requestObjects;

import com.medkhalil.CarAPI.helpers.abstracts.AbstractObject;
import com.medkhalil.CarAPI.model.Marque;
import com.medkhalil.CarAPI.model.Modele;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrUpdateReq  extends AbstractObject{ 


    private String energie;
    

    private Integer kilometrage;
    

    private String boiteVitesse;
    

    private Integer nbPlace;
    

    private Integer nbPorte;
    

}


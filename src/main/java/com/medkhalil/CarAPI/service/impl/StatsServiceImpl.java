package com.medkhalil.CarAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMinResponse;
import com.medkhalil.CarAPI.repository.StatsRepository;
import com.medkhalil.CarAPI.service.StatsService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

@Service
public class StatsServiceImpl implements StatsService{
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	StatsRepository statsRepo;
	
	@Override
	public GetMinResponse getMin(StatsRequestObject stats) {
		//Check parameters validity ?
		//Build params

		Query q = em.createNativeQuery("SELECT min(d.prix) FROM data d "
				+ "where ( modele_id = ?1 OR ?1 IS NULL)"
				+ "and ( marque_id = ?2 OR ?2 IS NULL)"
				+ "and ( annee = ?3 OR ?3 IS NULL)"
				+ "and ( energie=?4 OR ?4 IS NULL)"
				+ "and ( boiteVitesse=?5 OR ?5 IS NULL)");
		q.setParameter(1, stats.getModele_id());
		q.setParameter(2, stats.getMarque_id());
		q.setParameter(3, stats.getAnnee());
		q.setParameter(4, stats.getEnergie());
		q.setParameter(5, stats.getBoiteVitesse());
		Integer res;
		  try {
		    res = (Integer) q.getSingleResult();
		  } catch (NoResultException e) {
		    res = null;
		  }
		GetMinResponse result = new GetMinResponse();
		//This setters can be replaced with a mapper function ; Todo
		result.setMinimumPrice(res);
		result.setAnnee(stats.getAnnee());
		result.setModele_id(stats.getModele_id());
		result.setMarque_id(stats.getModele_id());
		return result;
	}

}

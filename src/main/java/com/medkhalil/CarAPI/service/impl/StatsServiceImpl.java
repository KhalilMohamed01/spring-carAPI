package com.medkhalil.CarAPI.service.impl;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medkhalil.CarAPI.helpers.requestObjects.StatsRequestObject;
import com.medkhalil.CarAPI.helpers.responseObjects.AllStatsSqlReqModel;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAllStatsResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetAvgResponse;
import com.medkhalil.CarAPI.helpers.responseObjects.GetMaxResponse;
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

	@Override
	public GetMaxResponse getMax(StatsRequestObject stats) {
		Query q = em.createNativeQuery("SELECT max(d.prix) FROM data d "
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
		  GetMaxResponse result = new GetMaxResponse();
		//This setters can be replaced with a mapper function ; Todo
		result.setMaximumPrice(res);
		result.setAnnee(stats.getAnnee());
		result.setModele_id(stats.getModele_id());
		result.setMarque_id(stats.getModele_id());
		return result;
	}

	@Override
	public GetAvgResponse getAvg(StatsRequestObject stats) {
		Query q = em.createNativeQuery("SELECT avg(d.prix) FROM data d "
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
		BigDecimal res ;
		  try {
		    res = (BigDecimal) q.getSingleResult();
		  } catch (NoResultException e) {
		    res = null;
		  }
		  GetAvgResponse result = new GetAvgResponse();
		//This setters can be replaced with a mapper function ; Todo
		result.setAvgPrice(res);
		result.setAnnee(stats.getAnnee());
		result.setModele_id(stats.getModele_id());
		result.setMarque_id(stats.getModele_id());
		return result;
	}

	@Override
	public GetAllStatsResponse getAllStats(StatsRequestObject stats) {
		GetAllStatsResponse result = new GetAllStatsResponse();
		Query q = em.createNativeQuery("SELECT avg(d.prix),max(d.prix),min(d.prix) FROM data d "
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
		List<Object> res;
		  try {
		    res =  q.getResultList();
		  } catch (NoResultException e) {
		    res = null;
		  }
		  Iterator itr = res.iterator();
		  while(itr.hasNext()){
		     Object[] obj = (Object[]) itr.next();
		     	result.setAvgPrice(new BigDecimal(String.valueOf(obj[0])));
				result.setMaximumPrice(Integer.parseInt(String.valueOf(obj[1])));
				result.setMinimumPrice(Integer.parseInt(String.valueOf(obj[2])));
		  }
		 
		//This setters can be replaced with a mapper function ; Todo
		
		result.setAnnee(stats.getAnnee());
		result.setModele_id(stats.getModele_id());
		result.setMarque_id(stats.getModele_id());
		return result;
	}

}

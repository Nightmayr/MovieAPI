package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Film;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class FilmDBRepository implements FilmRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	public String getAllFilms() {
		Query query = manager.createQuery("SELECT * FROM Film");
		Collection<Film> films = (Collection<Film>)query.getResultList();
		return util.getJSONForObject(films);
	}
	
	
	public String addFilm(String film) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteFilm(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.FilmRepository;

public class FilmServiceImplementation implements FilmService {


	@Inject
	private FilmRepository repo;
	

	public String getAllFilms() {
		return repo.getAllFilms();
	}

	public String addFilm(String film) {
		return repo.addFilm(film);
	}

	public String deleteFilm(String name) {
		return repo.deleteFilm(name);
	}
	
	public void setRepo(FilmRepository repo) {
		this.repo = repo;
	}
	
}

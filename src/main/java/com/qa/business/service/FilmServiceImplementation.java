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
		film = film.toLowerCase();
		
		if (film.contains("titanic")) {
			return "nah m8";
		}
		else {
			return repo.addFilm(film);
		}
	}

	public String deleteFilm(Long id) {
		return repo.deleteFilm(id);
	}
	
	public void setRepo(FilmRepository repo) {
		this.repo = repo;
	}
	
}

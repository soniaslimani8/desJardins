package com.example.entrevueSpringBoot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmRepository filmRepository;

	public void setFilmRepository(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}
	@Override
	public Film getFilm(Long filmId) {
		Optional<Film> optFilm = filmRepository.findById(filmId);
		return optFilm.get();
	}
	@Override
	public Film saveFilm(Film film){
		return filmRepository.save(film);
		
	}
}
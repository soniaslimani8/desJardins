package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Film;

public interface FilmService {
	 public Film getFilm(Long filmId);
	 public Film saveFilm(Film film);
	}

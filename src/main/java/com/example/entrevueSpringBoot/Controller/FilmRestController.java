package com.example.entrevueSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.model.Film;
import com.example.entrevueSpringBoot.service.FilmService;
 
@RestController
public class FilmRestController {
  
 @Autowired
 private FilmService filmService;
  
 public void setFilmService(FilmService filmService) {
  this.filmService = filmService;
 }
   
 @GetMapping("/api/film/{filmId}")
 public Film getFilm(@PathVariable(name="filmId")Long filmId) {
  return filmService.getFilm(filmId);
 }
  
 @PostMapping(path="/api/film", consumes = "application/json", produces = "application/json")
 @ResponseStatus(code = HttpStatus.CREATED)
 public Film saveFilm(@RequestBody Film film){
  return filmService.saveFilm(film);
 }
  
}
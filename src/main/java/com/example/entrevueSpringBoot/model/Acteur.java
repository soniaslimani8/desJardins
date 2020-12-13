package com.example.entrevueSpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ACTEUR")
public class Acteur {

	public Acteur() {

	}

	public Acteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@Id
	@SequenceGenerator(name = "FILM_SEQ",sequenceName = "film_seq",
	initialValue = 4, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FILM_SEQ")

	private Long id;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRENOM")
	private String prenom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


}

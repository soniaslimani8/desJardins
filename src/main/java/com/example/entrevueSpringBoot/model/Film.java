package com.example.entrevueSpringBoot.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="FILM")
public class Film {

	public Film() {

	}
	public Film(String titre, String description, List<Acteur> acteurs) {
		this.titre = titre;
		this.description = description;
		this.acteurs=acteurs;
	}

	@Id
	@SequenceGenerator(name = "FILM_SEQ",sequenceName = "film_seq",
	initialValue = 4, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FILM_SEQ")
	private Long id;

	@Column(name="TITRE")
	private String titre;

	@Column(name="DESCRIPTION")
	private String description;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="film_id")
	private List<Acteur> acteurs=new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public List<Acteur> getActeurs() {
		return acteurs;
	}
	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}


}
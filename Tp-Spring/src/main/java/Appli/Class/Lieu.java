package Appli.Class;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "nom", length = 255)
	private String nom;
	@Column(name = "information", length = 255)
	private String information;
	private int version;
	@ManyToOne
	@JoinColumn(name="id_praticien")
	private Praticien praticien;
	@Embedded
	private Adresse adresse;
	@OneToMany(mappedBy = "lieu")
	private List<Creneau> creneaux = new ArrayList();
	
	public Lieu(String nom, String information) {
		super();
		this.nom = nom;
		this.information = information;
	}
	public Lieu() {
		super();
	}
	
	public Long getId() {
		return Id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Praticien getPraticien() {
		return praticien;
	}
	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Creneau> getCreneaux() {
		return creneaux;
	}
	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	public void setId(Long id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Lieu [Id=" + Id + ", nom=" + nom + ", information=" + information + "]";
	}


	
	

}

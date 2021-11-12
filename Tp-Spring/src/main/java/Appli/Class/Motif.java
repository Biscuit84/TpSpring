package Appli.Class;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Motif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int version;
	@Column(name = "nom", length = 255)
	private String nom;
	@Column(name = "nombre_creneau", length = 50)
	private int nbCreneau;

	@OneToMany(mappedBy = "motif")
	private List<Consultation> consultation = new ArrayList<Consultation>();
	
	@ManyToOne
	@JoinColumn(name="id_specialite")
	private Specialite specialite;
	
	public Motif() {
		super();
	}



	public Motif(String nom, int nbCreneau, Specialite specialite) {
		super();
		this.nom = nom;
		this.nbCreneau = nbCreneau;
		this.specialite = specialite;
	}


	public Long getId() {
		return id;
	}

	

	
	public void setId(Long id) {
		this.id = id;
	}



	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbCreneau() {
		return nbCreneau;
	}


	public void setNbCreneau(int nbCreneau) {
		this.nbCreneau = nbCreneau;
	}



	
	public List<Consultation> getConsultation() {
		return consultation;
	}



	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}



	public Specialite getSpecialite() {
		return specialite;
	}



	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}



	@Override
	public String toString() {
		return "Motif [nom=" + nom + ", nbCreneau=" + nbCreneau + ", specialite=" + specialite + "]";
	}


	
	
	
	
}

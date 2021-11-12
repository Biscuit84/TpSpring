package Appli.Class;

import java.util.ArrayList;
import java.util.List;

public class Motif {

	private Long id;
	
	private int version;
	
	private String nom;
	
	private int nbCreneau;

	private List<Consultation> consultation = new ArrayList<Consultation>();
	
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

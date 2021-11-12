package Appli.Class;

import java.util.List;

public class Specialite {

	private Long id;
	
	private int version;
	
	private String nom;
	
	private List<Motif> motifs;
	
	private Praticien praticien;

	public Specialite() {
		super();
	}



	public Specialite(String nom, Praticien praticien) {
		super();
		this.nom = nom;
		this.praticien = praticien;
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

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Motif> getMotifs() {
		return motifs;
	}



	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}



	public Praticien getPraticien() {
		return praticien;
	}



	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}



	@Override
	public String toString() {
		return "Specialite [nom=" + nom + ", praticien=" + praticien + "]";
	}

	
	
	
}

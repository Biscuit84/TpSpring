package Appli.Class;

public class Motif {

	private Long id;
	
	private int version;
	
	private String nom;
	
	private int nbCreneau;

	
	public Motif() {
		super();
	}


	public Motif(String nom, int nbCreneau) {
		super();
		this.nom = nom;
		this.nbCreneau = nbCreneau;
	}


	public Long getId() {
		return id;
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


	@Override
	public String toString() {
		return "Motif [nom=" + nom + ", nbCreneau=" + nbCreneau + "]";
	}
	
	
	
	
}

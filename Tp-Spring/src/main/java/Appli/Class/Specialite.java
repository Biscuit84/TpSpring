package Appli.Class;

public class Specialite {

	private Long id;
	
	private int version;
	
	private String nom;

	public Specialite() {
		super();
	}

	public Specialite(String nom) {
		super();
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Specialite [nom=" + nom + "]";
	}
	
	
	
	
}

package Appli.Class;

public class Lieu {
	private Long Id;
	private String nom;
	private String information;
	private int version;
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
	@Override
	public String toString() {
		return "Lieu [Id=" + Id + ", nom=" + nom + ", information=" + information + "]";
	}
	public Lieu(Long id, String nom, String information) {
		super();
		Id = id;
		this.nom = nom;
		this.information = information;
	}
	public Lieu() {
		super();
	}
	public Long getId() {
		return Id;
	}
	
	

}

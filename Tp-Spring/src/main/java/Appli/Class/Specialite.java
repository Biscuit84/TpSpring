package Appli.Class;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "specialite")
@DiscriminatorColumn(name = "specialite")
public class Specialite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Version
	private int version;
	
	private String nom;
	
	@OneToMany(mappedBy="specialite")
	private List<Motif> motifs = new ArrayList<Motif>();
	@ManyToOne
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

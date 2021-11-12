package Appli.Class;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "creneaux")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "creneaux")
public class Creneau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private LocalDateTime debut;
	private Integer duree;
	private boolean dispo;
	@ManyToOne
	private Praticien praticien;
	@ManyToOne
	private Lieu lieu;
	@ManyToOne
	private Consultation consultation;
	
	public Creneau( LocalDateTime debut, Integer duree, boolean dispo, Praticien praticien, Lieu lieu) {
		super();
		this.debut = debut;
		this.duree = duree;
		this.dispo = dispo;
		this.praticien = praticien;
		this.lieu = lieu;
	}

	public Creneau() {
		super();
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

	public LocalDateTime getDebut() {
		return debut;
	}

	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	
	
	@Override
	public String toString() {
		return "Creneau [debut=" + debut + ", duree=" + duree + ", dispo="
				+ dispo + "]";
	}
	
	
	
	
	
	
	
}

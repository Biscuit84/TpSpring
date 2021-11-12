package Appli.Class;

import java.time.LocalDateTime;

public class Creneau {

	private Long id;
	private int version;
	private LocalDateTime debut;
	private Integer duree;
	private boolean dispo;
	private Praticien praticien;
	private Lieu lieu;
	private Consultation consultation;
	
	public Creneau( LocalDateTime debut, Integer duree, boolean dispo, Praticien praticien, Lieu lieu,
			Consultation consultation) {
		super();
		this.debut = debut;
		this.duree = duree;
		this.dispo = dispo;
		this.praticien = praticien;
		this.lieu = lieu;
		this.consultation = consultation;
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

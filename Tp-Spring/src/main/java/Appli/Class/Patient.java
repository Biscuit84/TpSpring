package Appli.Class;

import java.time.LocalDate;

public class Patient {

	private Long id;
	
	private int version;
	
	private Civilite civilite;
	
	private String nom;
	
	private String prenom;
	
	private String telephone;
	
	private LocalDate dtNaissance;
	
	private String email;
	
	private boolean principal;

	private List<Consultation> historique;
	
	private Utilisateur compte;
	
	private Adresse adresse;
	
	public Patient() {
		super();
	}



	public Patient(Civilite civilite, String nom, String prenom, String telephone, LocalDate dtNaissance, String email,
			boolean principal, Utilisateur compte, Adresse adresse) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dtNaissance = dtNaissance;
		this.email = email;
		this.principal = principal;
		this.compte = compte;
		this.adresse = adresse;
	}



	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public Civilite getCivilite() {
		return civilite;
	}


	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public LocalDate getDtNaissance() {
		return dtNaissance;
	}


	public void setDtNaissance(LocalDate dtNaissance) {
		this.dtNaissance = dtNaissance;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isPrincipal() {
		return principal;
	}


	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}


	public Long getId() {
		return id;
	}

	

	
	public void setId(Long id) {
		this.id = id;
	}



	public List<Consultation> getHistorique() {
		return historique;
	}



	public void setHistorique(List<Consultation> historique) {
		this.historique = historique;
	}



	public Utilisateur getCompte() {
		return compte;
	}



	public void setCompte(Utilisateur compte) {
		this.compte = compte;
	}



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return "Patient [civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone
				+ ", dtNaissance=" + dtNaissance + ", email=" + email + ", principal=" + principal + ", compte="
				+ compte + ", adresse=" + adresse + "]";
	}




	
	
	
}

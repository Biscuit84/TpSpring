package Appli.Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "patient")
@DiscriminatorColumn(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Enumerated(EnumType.STRING)
	@Column(name = "civilite", length = 5)
	private Civilite civilite;
	@Column(name = "nom", length = 100)
	private String nom;
	@Column(name = "prenom", length = 100)
	private String prenom;
	@Column(name = "telephone", length = 20)
	private String telephone;
	@Column(name = "dtNaissance", length = 20)
	private LocalDate dtNaissance;
	@Column(name = "email", length = 250)
	private String email;
	@Column(name = "principal", length = 5)
	private boolean principal;

	@OneToMany(mappedBy = "patient")
	private List<Consultation> consultations = new ArrayList<Consultation>();
	@ManyToOne
	private Utilisateur compte;
	@Embedded
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






	public List<Consultation> getConsultations() {
		return consultations;
	}



	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
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

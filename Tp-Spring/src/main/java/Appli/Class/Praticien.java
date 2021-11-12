package Appli.Class;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Praticien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Enumerated(EnumType.STRING)
	@Column(name = "civilite", length = 5)
	private Civilite civilite;
	@Column(name = "nom", length = 255)
	private String nom;
	@Column(name = "prenom", length = 255)
	private String prenom;
	@Column(name = "telephone", length = 255)
	private String telephone;
	@Enumerated(EnumType.STRING)
	@Column(name = "secteur", length = 50)
	private Secteur secteur;
	@Column(name = "carte_vitale", length = 50)
	private boolean carteVitale;
	@Column(name = "photo", length = 255)
	private String photo;
	@Column(name = "carte_bancaire", length = 50)
	private boolean carteBancaire;
	@Column(name = "cheque", length = 50)
	private boolean cheque;
	@Column(name = "espace", length = 50)
	private boolean espace;
	@Column(name = "duree_creneau", length = 50)
	private Integer dureeCreneau;
	
	private int version;
	
	@OneToOne
	private Utilisateur utilisateur;
	@OneToMany(mappedBy = "praticien")
	private List<Lieu> lieux = new ArrayList<Lieu>();
	@OneToMany(mappedBy = "praticien")
	private List<Specialite> specialites = new ArrayList<Specialite>();
	@OneToMany(mappedBy = "praticien")
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	

		
	public Praticien() {
		super();
	}
			
	public Praticien(Civilite civilite, String nom, String prenom, String telephone, Secteur secteur,
			boolean carteVitale, String photo, boolean carteBancaire, boolean cheque, boolean espace,
			Integer dureeCreneau) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.secteur = secteur;
		this.carteVitale = carteVitale;
		this.photo = photo;
		this.carteBancaire = carteBancaire;
		this.cheque = cheque;
		this.espace = espace;
		this.dureeCreneau = dureeCreneau;
	}
	
	

	public Praticien(Civilite civilite, String nom, String prenom, String telephone, Secteur secteur,
			boolean carteVitale, String photo, boolean carteBancaire, boolean cheque, boolean espace,
			Integer dureeCreneau, int version, Utilisateur utilisateur, List<Lieu> lieux,
			List<Specialite> specialites, List<Creneau> creneaux) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.secteur = secteur;
		this.carteVitale = carteVitale;
		this.photo = photo;
		this.carteBancaire = carteBancaire;
		this.cheque = cheque;
		this.espace = espace;
		this.dureeCreneau = dureeCreneau;
		this.version = version;
		this.utilisateur = utilisateur;
		this.lieux = lieux;
		this.specialites = specialites;
		this.creneaux = creneaux;
	}

	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public void setId(long id) {
		this.id = id;
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
	public Secteur getSecteur() {
		return secteur;
	}
	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	public boolean isCarteVitale() {
		return carteVitale;
	}
	public void setCarteVitale(boolean carteVitale) {
		this.carteVitale = carteVitale;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public boolean isCarteBancaire() {
		return carteBancaire;
	}
	public void setCarteBancaire(boolean carteBancaire) {
		this.carteBancaire = carteBancaire;
	}
	public boolean isCheque() {
		return cheque;
	}
	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}
	public boolean isEspace() {
		return espace;
	}
	public void setEspace(boolean espace) {
		this.espace = espace;
	}
	public Integer getDureeCreneau() {
		return dureeCreneau;
	}
	public void setDureeCreneau(Integer dureeCreneau) {
		this.dureeCreneau = dureeCreneau;
	}
	public long getId() {
		return id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	public List<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	@Override
	public String toString() {
		return "Praticien [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", carteVitale="
				+ carteVitale + ", photo=" + photo + ", carteBancaire=" + carteBancaire + ", cheque=" + cheque
				+ ", espace=" + espace + ", dureeCreneau=" + dureeCreneau + "]";
	}
	
	
	
	
	
	
	
}

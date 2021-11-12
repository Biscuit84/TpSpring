package Appli.Class;

import java.util.ArrayList;
import java.util.List;


public class Praticien {

	private long id;
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private Secteur secteur;
	private boolean carteVitale;
	private String photo;
	private boolean carteBancaire;
	private boolean cheque;
	private boolean espace;
	private Integer dureeCreneau;
	
	private int version;
	
	private List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	private List<Lieu> lieux = new ArrayList<Lieu>();
	private List<Specialite> specialites = new ArrayList<Specialite>();
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
			Integer dureeCreneau, int version, List<Utilisateur> utilisateurs, List<Lieu> lieux,
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
		this.utilisateurs = utilisateurs;
		this.lieux = lieux;
		this.specialites = specialites;
		this.creneaux = creneaux;
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

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
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

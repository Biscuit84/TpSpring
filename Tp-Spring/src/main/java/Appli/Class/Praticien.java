package Appli.Class;

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
	public void setId(long id) {
		this.id = id;
	}





	@Override
	public String toString() {
		return "Praticien [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", carteVitale="
				+ carteVitale + ", photo=" + photo + ", carteBancaire=" + carteBancaire + ", cheque=" + cheque
				+ ", espace=" + espace + ", dureeCreneau=" + dureeCreneau + "]";
	}
	
	
	
	
	
	
	
}

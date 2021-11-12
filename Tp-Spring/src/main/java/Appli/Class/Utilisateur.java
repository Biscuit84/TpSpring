package Appli.Class;

public class Utilisateur {
	
	private Long id;
	
	private int version;
	
	private String email;
	
	private String motDePasse;
	
	private Type type;
	
	
	public Utilisateur() {
		super();
	}


	public Utilisateur(String email, String motDePasse, Type type) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
		this.type = type;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Utilisateur [email=" + email + ", motDePasse=" + motDePasse + "]";
	}
	
	
	

}

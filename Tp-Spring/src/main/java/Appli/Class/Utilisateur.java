package Appli.Class;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "utilisateur")
@DiscriminatorColumn(name = "utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "email")
	private String email;
	@Column(name = "motDePasse")
	private String motDePasse;
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
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


	@Override
	public String toString() {
		return "Utilisateur [email=" + email + ", motDePasse=" + motDePasse + "]";
	}
	
	
	

}

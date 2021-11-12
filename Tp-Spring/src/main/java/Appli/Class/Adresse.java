package Appli.Class;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	
 private String voie;
 private String complement;
 private String codePostal;
 private String ville;
 
 
 
 
public Adresse() {
	super();
}


public Adresse(String voie, String complement, String codePostal, String ville) {
	super();
	this.voie = voie;
	this.complement = complement;
	this.codePostal = codePostal;
	this.ville = ville;
}


public String getVoie() {
	return voie;
}


public void setVoie(String voie) {
	this.voie = voie;
}


public String getComplement() {
	return complement;
}


public void setComplement(String complement) {
	this.complement = complement;
}


public String getCodePostal() {
	return codePostal;
}


public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


@Override
public String toString() {
	return "Adresse [voie=" + voie + ", complement=" + complement + ", codePostal=" + codePostal + ", ville=" + ville
			+ "]";
}



	
}

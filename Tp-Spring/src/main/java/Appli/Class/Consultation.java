package Appli.Class;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "consultation")
@DiscriminatorColumn(name = "consultation")
public class Consultation {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(name = "civilite")
 private String instruction;
 @ManyToOne
 private Patient patient;
 
 @OneToMany(mappedBy="consultation")
 private List<Creneau> creneaux= new ArrayList<Creneau>();
 
 @ManyToOne
 private Motif motif;
 
 
 


public Consultation() {
	super();
}





public Consultation(String instruction, Patient patient, Motif motif) {
	super();
	this.instruction = instruction;
	this.patient = patient;
	this.motif = motif;
}






public Consultation(String instruction, Patient patient, List<Creneau> creneaux, Motif motif) {
	super();
	this.instruction = instruction;
	this.patient = patient;
	this.creneaux = creneaux;
	this.motif = motif;
}





public String getInstruction() {
	return instruction;
}
public void setInstruction(String instruction) {
	this.instruction = instruction;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
public List<Creneau> getCreneaux() {
	return creneaux;
}
public void setCreneaux(List<Creneau> creneaux) {
	this.creneaux = creneaux;
}
public Motif getMotif() {
	return motif;
}
public void setMotif(Motif motif) {
	this.motif = motif;
}
public Long getId() {
	return id;
}





@Override
public String toString() {
	return "Consultation [id=" + id + ", instruction=" + instruction + ", patient=" + patient + ", motif=" + motif
			+ "]";
}
 


 
 
}

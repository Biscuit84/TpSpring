import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Appli.Class.Adresse;
import Appli.Class.Civilite;
import Appli.Class.Consultation;
import Appli.Class.Creneau;
import Appli.Class.Lieu;
import Appli.Class.Motif;
import Appli.Class.Patient;
import Appli.Class.Praticien;
import Appli.Class.Secteur;
import Appli.Class.Specialite;
import Appli.Class.Type;
import Appli.Class.Utilisateur;

import Appli.repository.IConsultationRepo;
import Appli.repository.ICreneauRepo;
import Appli.repository.ILieuRepo;
import Appli.repository.IMotifRepo;
import Appli.repository.IPatientRepo;
import Appli.repository.IPraticienRepo;
import Appli.repository.ISpecialiteRepo;
import Appli.repository.IUtilisateurRepo;



public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		


        
       
        
        
		//IAdresseRepo adresseRepo = spring.getBean(IAdresseRepo .class);
		IConsultationRepo consultationRepo = spring.getBean(IConsultationRepo .class);
		ICreneauRepo creneauRepo = spring.getBean(ICreneauRepo .class);
		ILieuRepo lieuRepo = spring.getBean(ILieuRepo .class);
		IMotifRepo motifRepo = spring.getBean(IMotifRepo .class);
		IPatientRepo patientRepo = spring.getBean(IPatientRepo .class);
		IPraticienRepo praticienRepo = spring.getBean(IPraticienRepo .class);
		ISpecialiteRepo specialiteRepo = spring.getBean(ISpecialiteRepo .class);
		IUtilisateurRepo utilisateurRepo = spring.getBean(IUtilisateurRepo .class);
		
		
		Utilisateur admin = new Utilisateur ("admin@admin.fr","admin",Type.ADMIN);
		Utilisateur praticien1 = new Utilisateur ("praticien1@praticien.fr","praticien1",Type.PRATICIEN);
		Utilisateur patient1 = new Utilisateur ("patient1@patient.fr","patient",Type.PATIENT);
		
		admin = utilisateurRepo.save(admin);
		praticien1 = utilisateurRepo.save(praticien1);
		patient1 = utilisateurRepo.save(patient1);
		
		Praticien bulle = new Praticien(Civilite.M,"Bulle","Patrick","0678564265",Secteur.SECTEUR_1,true,"img-profil.png",true,true,true,15);
		
		bulle = praticienRepo.save(bulle);
	
		
		Specialite specialite1=new Specialite ("Medecin generaliste",bulle);
		
		specialite1= specialiteRepo.save(specialite1);
		
		Motif premiereConsul = new Motif("Premiere Consultation",2,specialite1);
		Motif suivieConsul = new Motif("Suivie Consultation",2,specialite1);
		
		premiereConsul=motifRepo.save(premiereConsul);
		suivieConsul=motifRepo.save(suivieConsul);
		
		Lieu cabinet = new Lieu ("Cabinet Dodo","1er étage");
		
		Adresse ad1 = new Adresse("Rue Didier", "1er étage","84100","Orange");
		
		cabinet.setAdresse(ad1);
		
		cabinet=lieuRepo.save(cabinet);
		
		Adresse ad2 = new Adresse("Rue Boule", "5e étage","84000","Avignon");
		
		String dateN1 = "05/01/1988";
		LocalDate localDate1 = LocalDate.parse(dateN1, formatter2);
		Patient tutu = new Patient (Civilite.MLLE,"Tutu","Lili","0678898265",localDate1,"patient1Lili@patient.fr",true,patient1,ad2);
		
		String datec1 = "13/12/2021 10:30";
		String datec2 = "13/12/2021 11:30";
		 LocalDateTime localDateT1 = LocalDateTime.parse(datec1, formatter);
		 LocalDateTime localDateT2 = LocalDateTime.parse(datec2, formatter);
		
		Creneau c1 = new Creneau(localDateT1,15,true,bulle,cabinet);
		Creneau c2 = new Creneau(localDateT2,15,true,bulle,cabinet);
		
		List<Creneau> crenaux = new ArrayList<Creneau>();
		crenaux.add(c1);
		crenaux.add(c2);
		
		Consultation cons1 = new Consultation("Apporter votre carnet de sante",tutu,premiereConsul);
		
		tutu=patientRepo.save(tutu);
		c1=creneauRepo.save(c1);
		
		c2=creneauRepo.save(c2);
		
		cons1.setCreneaux(crenaux);
		
		cons1=consultationRepo.save(cons1);
		
		spring.close();
		
		
		

	}

}

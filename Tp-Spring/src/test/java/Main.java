import java.text.SimpleDateFormat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Appli.Class.Civilite;
import Appli.Class.Praticien;
import Appli.Class.Secteur;
import Appli.Class.Specialite;
import Appli.Class.Type;
import Appli.Class.Utilisateur;
import Appli.repository.IAdresseRepo;
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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		IAdresseRepo adresseRepo = spring.getBean(IAdresseRepo .class);
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
		
		Praticien bulle = new Praticien(Civilite.M,"Bulle","Patrick","0678564265",Secteur.SECTEUR_1,true,"img-profil.png",true,true,true,15);
		
		
		Specialite specialite1=new Specialite ("Medecin generaliste",bulle);
		
		
		
		
		
		
		
		
		

	}

}

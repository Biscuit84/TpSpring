package Appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Appli.Class.Utilisateur;


public interface IUtilisateurRepo extends JpaRepository<Utilisateur, Long>{

}

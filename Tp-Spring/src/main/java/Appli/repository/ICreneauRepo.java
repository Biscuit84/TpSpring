package Appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Appli.Class.Adresse;
import Appli.Class.Creneau;


public interface ICreneauRepo extends JpaRepository<Creneau, Long>{

}

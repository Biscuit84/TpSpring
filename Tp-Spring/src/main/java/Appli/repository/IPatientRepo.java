package Appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Appli.Class.Patient;

public interface IPatientRepo extends JpaRepository<Patient, Long>{

}

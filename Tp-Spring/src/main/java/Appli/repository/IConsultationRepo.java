package Appli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Appli.Class.Consultation;

public interface IConsultationRepo  extends JpaRepository<Consultation, Long>{

}

package ma.ensaf.springbootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaf.springbootjpa.model.Personne;


public interface PersonneRepository extends JpaRepository<Personne, Long>{

}

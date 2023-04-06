package all.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import all.condominio.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{

}

package all.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import all.condominio.model.Riunione;

@Repository
public interface RiunioneRepository extends JpaRepository<Riunione,Long>{

}

package all.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import all.condominio.model.Condominio;

@Repository
public interface CondominioRepository extends JpaRepository<Condominio, Long>{

}

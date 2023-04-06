package all.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import all.condominio.model.Appartamento;

@Repository
public interface AppartamentoRepository extends JpaRepository<Appartamento, Long>{

}

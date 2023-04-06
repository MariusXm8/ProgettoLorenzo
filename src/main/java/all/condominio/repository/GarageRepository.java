package all.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import all.condominio.model.Garage;

@Repository
public interface GarageRepository extends JpaRepository<Garage,Long>{

}

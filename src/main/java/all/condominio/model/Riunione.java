package all.condominio.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Riunione")
public class Riunione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="data")
	private String data;
	
	@Column(name="listaPersone")
	//relazione da aggiungere
	private List<Persona> listaPersone;
	
	@Column(name="listaPartecipanti")
	private int listaPartecipanti;
}

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
@Table(name="Condominio")
public class Condominio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "via")
	private String via;
	
	@Column(name = "listaAppartamenti")
	private List<Appartamento> listaAppartamenti;
	
	@Column(name = "listaGarage")
	private List<Garage> listaGarage;

}

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
@Table(name="Appartamento")
public class Appartamento {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="condominio")
	//relazione da aggiungere
	private Long condominio;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="listaProprietari")
	//relazione da aggiungere
	private List<Persona> listaProprietari;
	
	@Column(name="metratura")
	private String metratura;
	
	@Column(name="consumo")
	private double consumo;
	
	
}

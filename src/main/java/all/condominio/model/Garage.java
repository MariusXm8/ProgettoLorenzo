package all.condominio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Garage")
public class Garage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="condominio")
	//relazione da aggiungere
	private Long condominio;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="consumo")
	private double consumo;
}

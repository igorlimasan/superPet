package br.com.superpet.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "adocao")
public class Adocao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="fk_pet")
	private Pet pet;
	
	@OneToOne
	@JoinColumn(name = "fk_usuario_cuidador")
	private Usuario cuidador;
	
	@OneToOne
	@JoinColumn(name = "fk_usuario_adotador")
	private Usuario adotador;
	
	@Column(name = "data")
	@Temporal(value = TemporalType.TIMESTAMP)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data;
	
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Usuario getCuidador() {
		return cuidador;
	}

	public void setCuidador(Usuario cuidador) {
		this.cuidador = cuidador;
	}

	public Usuario getAdotador() {
		return adotador;
	}

	public void setAdotador(Usuario adotador) {
		this.adotador = adotador;
	}	
	
	

}

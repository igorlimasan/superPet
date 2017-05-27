package br.com.superpet.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "adocao")
public class Adocao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@EmbeddedId
	private AdocaoId adocaoId;
	
	@Column(name = "data")
	@Temporal(value = TemporalType.TIMESTAMP)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data;
	
	public AdocaoId getAdocaoId() {
		return adocaoId;
	}

	public void setAdocaoId(AdocaoId adocaoId) {
		this.adocaoId = adocaoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	

}

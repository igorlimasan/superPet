package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interesse")
public class Interesse {
	
	@EmbeddedId
	private InteresseId interesseId;

	public InteresseId getInteresseId() {
		return interesseId;
	}

	public void setInteresseId(InteresseId interesseId) {
		this.interesseId = interesseId;
	}
	
	
	
	

}

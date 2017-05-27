package br.com.superpet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Entity
@Table(name = "pet")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_tipo")
	private Tipo tipo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_porte")
	private Porte porte;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_sexo")
	private Sexo sexo;
	
	@Column(name = "raca")
	private String raca;
	
	@JsonView({View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_idade")
	private Idade idade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Idade getIdade() {
		return idade;
	}

	public void setIdade(Idade idade) {
		this.idade = idade;
	}
	
	
	
	
}

package br.com.superpet.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@JsonView({View.All.class,View.Alternative.class})
	private Long id;
	
	@Column(name = "nome")
	@JsonView({View.All.class,View.Alternative.class})
	private String nome;
	
	@JsonView({View.All.class,View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_tipo")
	private Tipo tipo;
	
	@JsonView({View.All.class,View.Alternative.class})
	@Column(name = "descricao")
	private String descricao;
	
	
	
	@JsonView({View.All.class,View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_porte")
	private Porte porte;
	
	@JsonView({View.All.class,View.Alternative.class})
	@OneToOne
	@JoinColumn(name = "fk_sexo")
	private Sexo sexo;
	
	@JsonView({View.All.class,View.Alternative.class})
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "pet_foto", joinColumns = {@JoinColumn(name = "fk_pet")}, 
	inverseJoinColumns= {@JoinColumn(name = "fk_foto")})
	private List<Foto> fotos;
	
	
	
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

	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	
	
	
	
	
	
}

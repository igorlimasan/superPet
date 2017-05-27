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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "email_contato")
	private String email_contato;
	
	@Column(name = "numero_contato")
	private String numero_contato;
	
	@Column(name = "facebook")
	private String facebook;
	
	
	
	@JsonView({View.All.class,View.Alternative.class})
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_autorizacao", joinColumns = {@JoinColumn(name = "fk_usuario")}, 
	inverseJoinColumns= {@JoinColumn(name = "fk_autorizacao")})
	private List<Autorizacao> autorizacoes;


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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail_contato() {
		return email_contato;
	}


	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}


	public String getNumero_contato() {
		return numero_contato;
	}


	public void setNumero_contato(String numero_contato) {
		this.numero_contato = numero_contato;
	}


	public String getFacebook() {
		return facebook;
	}


	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}


	public List<Autorizacao> getAutorizacoes() {
		return autorizacoes;
	}


	public void setAutorizacoes(List<Autorizacao> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}

}

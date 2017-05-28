package br.com.superpet.models;
import java.util.Collection;
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

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import br.com.superpet.views.View;

@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonView({View.All.class,View.Alternative.class})
	private Long id;
	
	@Column(name = "nome")
	@JsonView({View.All.class,View.Alternative.class})
	private String nome;
	
	@Column(name = "login")
	@JsonView({View.All.class,View.Alternative.class})
	private String login;
	
	@Column(name = "senha")
	@JsonIgnore
	private String senha;
	
	@Column(name = "email_contato")
	@JsonView({View.All.class,View.Alternative.class})
	private String emailContato;
	
	@Column(name = "numero_contato")
	@JsonView({View.All.class,View.Alternative.class})
	private String numeroContato;
	
	@Column(name = "facebook")
	@JsonView({View.All.class,View.Alternative.class})
	private String facebook;
	
	@Column(name = "cep")
	@JsonView({View.All.class,View.Alternative.class})
	private String cep;
	
	@Column(name = "estado")
	@JsonView({View.All.class,View.Alternative.class})
	private String estado;
	
	@Column(name = "cidade")
	@JsonView({View.All.class,View.Alternative.class})
	private String cidade;
	
	
	
	@JsonView({View.All.class,View.Alternative.class})
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "autorizacao_usuario", joinColumns = {@JoinColumn(name = "fk_usuario")}, 
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

	@JsonIgnore
	public String getSenha() {
		return senha;
	}

	@JsonProperty
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmailContato() {
		return emailContato;
	}


	public void setEmailContato(String email_contato) {
		this.emailContato = email_contato;
	}


	public String getNumeroContato() {
		return numeroContato;
	}


	public void setNumeroContato(String numero_contato) {
		this.numeroContato = numero_contato;
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

	//@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return autorizacoes;
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return senha;
	}

	@JsonIgnore
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return login;
	}
	
	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@JsonIgnore
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

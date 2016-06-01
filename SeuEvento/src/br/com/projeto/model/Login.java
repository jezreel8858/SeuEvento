package br.com.projeto.model;

import java.security.NoSuchAlgorithmException;

import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class Login {
	@NotEmpty
	private String login;
	@NotEmpty
	private String senha;
	public Login() {
		// TODO Auto-generated constructor stub
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
	
	public void criarSenha(String senha) throws NoSuchAlgorithmException{
		this.senha = senha;
	}
	
}

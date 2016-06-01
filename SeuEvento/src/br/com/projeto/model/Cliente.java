package br.com.projeto.model;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cliente implements EntityClass, Comparable<Cliente>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Embedded
	private String nomeFantasia;
	private Login login;
	private String tipo;
	private String nome;
	private String email;
	private String telefone;
	private String foto;
	
	@ManyToMany
	@JoinColumn(name="servicos_id")
	private List<Servico> servicos; 
	
	public int compareTo(Cliente user) {
		return this.getNome().compareTo(user.getNome());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void createLogin(String user, String senha) throws NoSuchAlgorithmException{   	// Padrao Creat
		login = new Login();
		login.setLogin(user);
		login.criarSenha(senha);
	}


	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}

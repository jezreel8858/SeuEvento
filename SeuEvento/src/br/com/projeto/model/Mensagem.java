package br.com.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mensagem implements EntityClass{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String tipo;
	private String mensagem;
	@ManyToOne
	private Cliente clienteUser;
	@ManyToOne
	private Cliente clienteServ;
	
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Cliente getClienteUser() {
		return clienteUser;
	}
	public void setClienteUser(Cliente clienteUser) {
		this.clienteUser = clienteUser;
	}
	public Cliente getClienteServ() {
		return clienteServ;
	}
	public void setClienteServ(Cliente clienteServ) {
		this.clienteServ = clienteServ;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}

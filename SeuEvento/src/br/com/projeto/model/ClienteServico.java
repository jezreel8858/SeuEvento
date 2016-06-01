package br.com.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ClienteServico implements EntityClass{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int qualificacao;
	
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Servico servico;
	@OneToMany
	private Mensagem mensagem;
	
	public int getQualificacao() {
		return qualificacao;
	}
	public void setQualificacao(int qualificacao) {
		this.qualificacao = qualificacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Mensagem getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
		
}

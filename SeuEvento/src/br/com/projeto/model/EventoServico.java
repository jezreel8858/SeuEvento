package br.com.projeto.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EventoServico implements EntityClass{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int qualificacao;

	private String status;

	@ManyToOne
	private Evento evento;
	
	@ManyToOne
	private Servico servico;

	@OneToMany
	private List<Mensagem> mensagem;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQualificacao() {
		return qualificacao;
	}

	public void setQualificacao(int qualificacao) {
		this.qualificacao = qualificacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Mensagem> getMensagem() {
		return mensagem;
	}

	public void setMensagem(List<Mensagem> mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}

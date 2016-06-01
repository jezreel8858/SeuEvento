package br.com.projeto.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evento implements EntityClass{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;

	@OneToMany
	private List<EventoServico> eventoServico;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<EventoServico> getEventoServico() {
		return eventoServico;
	}

	public void setEventoServico(List<EventoServico> eventoServico) {
		this.eventoServico = eventoServico;
	}

	
	
}

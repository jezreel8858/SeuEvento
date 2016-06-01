package br.com.projeto.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensagem implements EntityClass{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Usuario from;

	private Usuario to;

	private String mensage;

	private EventoServico eventoServico;

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getFrom() {
		return from;
	}

	public void setFrom(Usuario from) {
		this.from = from;
	}

	public Usuario getTo() {
		return to;
	}

	public void setTo(Usuario to) {
		this.to = to;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public EventoServico getEventoServico() {
		return eventoServico;
	}

	public void setEventoServico(EventoServico eventoServico) {
		this.eventoServico = eventoServico;
	}
	
	
	

}

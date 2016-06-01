package br.com.projeto.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Vendedor extends Usuario{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String experiencia;

	private int servicos_feitos;

	@OneToMany
	private List<Servico> servico;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public int getServicos_feitos() {
		return servicos_feitos;
	}

	public void setServicos_feitos(int servicos_feitos) {
		this.servicos_feitos = servicos_feitos;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}
	
	
	

}

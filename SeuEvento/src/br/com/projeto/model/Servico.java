package br.com.projeto.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Servico implements EntityClass{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String descricao;

	private ArrayList<String> images;

	private ArrayList<String> estados;

	private Vendedor vendedor;

	@OneToMany
	private List<EventoServico> eventoServico;

	@ManyToOne
	private Categoria categoria;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<String> getImages() {
		return images;
	}

	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

	public ArrayList<String> getEstados() {
		return estados;
	}

	public void setEstados(ArrayList<String> estados) {
		this.estados = estados;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public List<EventoServico> getEventoServico() {
		return eventoServico;
	}

	public void setEventoServico(List<EventoServico> eventoServico) {
		this.eventoServico = eventoServico;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}

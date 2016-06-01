package br.com.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements EntityClass, Comparable<Categoria>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String descricao;
	
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
	@Override
	public int compareTo(Categoria categoria) {
		return this.descricao.compareTo(categoria.getDescricao());
	}
	
	
	
	
}

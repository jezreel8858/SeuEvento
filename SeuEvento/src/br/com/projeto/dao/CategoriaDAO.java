package br.com.projeto.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.projeto.model.Categoria;

@Repository
public class CategoriaDAO extends GenericDAO<Categoria>{
	

	@Override
	public Class<Categoria> getClassType() {
		return Categoria.class;
	}
	
//	public List<Categoria> getCategoriaAtivo(){
//		String str = "select c from Categoria c where c.status = :ativo";
//		Query query=manager.createQuery(str);
//		query.setParameter("ativo", true);
//		return query.getResultList();
//	}

	@SuppressWarnings("unchecked")
	public List<Categoria> getByName(Categoria filtro) {
		String str = "select c from Categoria c where upper(c.descricao) like upper(:descricao)";
		Query query=manager.createQuery(str);
		query.setParameter("descricao", "%"+filtro.getDescricao()+"%");
		return query.getResultList();
	}
}

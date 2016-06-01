package br.com.projeto.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.projeto.model.Servico;

@Repository
public class ServicoDAO extends GenericDAO<Servico>{

	public Class<Servico> getClassType() {
		return Servico.class;
	}
	
//	public boolean exist(Servico servico){
//		Query result = null;
//		result = this.manager.createQuery("SELECT COUNT(c) FROM Cliente c WHERE c.login.login = :login");
//		result.setParameter("login", servico);
//		
//		return ((long) result.getSingleResult()) != 0;
//	}
	@SuppressWarnings("unchecked")
	public List<Servico> buscar(String filtro) {

		String str = "select s from Servico s where upper(descricao) like upper(:descricao)";
		if(filtro == null){
			filtro = "";
		}
		Query query=manager.createQuery(str);   
		
		query.setParameter("descricao", "%"+filtro+"%");
		
		return query.getResultList();	
	}
}

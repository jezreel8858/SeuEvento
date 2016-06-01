package br.com.projeto.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.projeto.model.Cliente;
import br.com.projeto.model.Login;

@Repository
public class ClienteDAO extends GenericDAO<Cliente>{

	public Class<Cliente> getClassType() {
		return Cliente.class;
	}
	
	public boolean exist(Cliente usuario){
		Query result = null;
		result = this.manager.createQuery("SELECT COUNT(c) FROM Cliente c WHERE c.login.login = :login");
		result.setParameter("login", usuario.getLogin().getLogin());
		
		return ((long) result.getSingleResult()) != 0;
	}
	
	@SuppressWarnings("unchecked")
	public Cliente procurarLoginSenha(Login login){
			Query query = manager.createQuery("SELECT c FROM Cliente c WHERE c.login.login = :login and c.login.senha = :senha ");
			query.setParameter("login",login.getLogin());
			query.setParameter("senha",login.getSenha());
			
			List<Cliente> usuarios =  query.getResultList();
			
			return usuarios.isEmpty() ? null : usuarios.get(0);
	}
	@SuppressWarnings("unchecked")
	public List<Cliente> buscar(String filtro) {

		String str = "select c from Cliente c where upper(nomeFantasia) like upper(:nomeFantasia)";
		if(filtro == null){
			filtro = "";
		}
		Query query=manager.createQuery(str);   
		
		query.setParameter("nomeFanatasia", "%"+filtro+"%");
		
		return query.getResultList();	
	}
}

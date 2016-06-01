package br.com.projeto.dao;

import org.springframework.stereotype.Repository;

import br.com.projeto.model.ClienteServico;

@Repository
public class ClienteServicoDAO extends GenericDAO<ClienteServico>{
	


	@Override
	public Class<ClienteServico> getClassType() {
		return ClienteServico.class;
	}

}

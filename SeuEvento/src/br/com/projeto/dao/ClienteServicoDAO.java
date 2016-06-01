package br.com.projeto.dao;

import org.springframework.stereotype.Repository;

import br.com.projeto.model.EventoServico;

@Repository
public class ClienteServicoDAO extends GenericDAO<EventoServico>{
	


	@Override
	public Class<EventoServico> getClassType() {
		return EventoServico.class;
	}

}

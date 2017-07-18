package com.beeva.ClienteSOAP.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.ClienteSOAP.dao.ClienteDao;
import com.beeva.ClienteSOAP.entity.Cliente;

@Repository
public class ClienteDaoImpl extends ClienteDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public Cliente getCliente(int Id) {
		return entityManager.find(Cliente.class, Id);
	}

}

package com.beeva.ClienteSOAP.ws;

import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.ClienteSOAP.dao.ClienteDao;
import com.beeva.ClienteSOAP.daoImpl.ClienteDaoImpl;


@WebService(endpointInterface="com.beeva.ClienteSOAP.ws.Cliente")
public class ClienteImpl implements Cliente{

	public com.beeva.ClienteSOAP.entity.Cliente Obtendatos(int id) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("core-context.xml");
		ClienteDao clienteDao = (ClienteDao) context.getBean(ClienteDaoImpl.class);
		com.beeva.ClienteSOAP.entity.Cliente consult= clienteDao.getCliente(id);
		  
		return consult ;
	}
	

}

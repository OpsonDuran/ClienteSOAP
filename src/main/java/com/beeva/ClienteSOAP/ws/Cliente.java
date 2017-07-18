package com.beeva.ClienteSOAP.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Cliente {
	@WebMethod
	public com.beeva.ClienteSOAP.entity.Cliente Obtendatos(int id);
}

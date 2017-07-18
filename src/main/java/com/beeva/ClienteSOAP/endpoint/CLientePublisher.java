package com.beeva.ClienteSOAP.endpoint;

import javax.xml.ws.Endpoint;

import com.beeva.ClienteSOAP.ws.ClienteImpl;


public class CLientePublisher {
   public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9997/ws/Obtendatos", new ClienteImpl());
}
}

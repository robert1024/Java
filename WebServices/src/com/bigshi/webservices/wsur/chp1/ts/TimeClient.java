package com.bigshi.webservices.wsur.chp1.ts;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TimeClient {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://127.0.0.1:9876/ts?wsdl");
			QName qname = new QName("http://ts.chp1.wsur.webservices.bigshi.com/","TimeServerImplService");
			Service service = Service.create(url,qname);
			TimeServer eif = service.getPort(TimeServer.class);
			System.out.println(eif.getTimeAsString());
			System.out.println(eif.getTimeAsElapsed());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

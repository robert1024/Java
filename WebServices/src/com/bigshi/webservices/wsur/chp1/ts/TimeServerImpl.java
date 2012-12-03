package com.bigshi.webservices.wsur.chp1.ts;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.bigshi.webservices.wsur.chp1.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	@WebMethod
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	@WebMethod
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}

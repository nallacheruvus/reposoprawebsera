package com.sat.hoster;

import javax.xml.ws.Endpoint;

import com.sat.impl.IReadFileImpl;

public class HosterMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:3343/ws/rf", new IReadFileImpl());
		System.out.println("Service is ready");
	}
}

package com.qa.interfacepr;

public class Ferrari implements Car,Zet {

	@Override
	public void start() {
		System.out.println("Ferrari Start method");

	}

	@Override
	public void stop() {
		System.out.println("Ferrari Stop method");

	}

	@Override
	public void refuel() {
		System.out.println("Ferrari Refuel method");

	}

	public void safety() {
		System.out.println("Ferrari Safety method");

	}

	@Override
	public void powerfuelgear() {
		System.out.println("Powerfull gear");
		
	}

}

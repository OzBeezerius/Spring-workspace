package com.everis.bootcamp.proxy;

import com.everis.bootcamp.person.IPersonProxyInterface;
import com.everis.bootcamp.person.Person;

public class Proxy implements IPersonProxyInterface {
	private Person person;

	public Proxy(Person person) {
		this.person = person;
	}

	@Override
	public void Operacion() {
		before();
		this.person.Operacion();
		after();
	}

	private void before() {
		System.out.println("Operacion de " + person.getName());
	}

	private void after() {
		System.out.println("Acabando operacion de " + person.getName());
	}

}

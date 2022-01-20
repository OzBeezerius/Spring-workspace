package com.everis.bootcamp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.everis.bootcamp.proxy.Proxy;

@SpringBootApplication
public class Test implements CommandLineRunner {

	@Autowired
	public ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonSingleton.getInstance().setName("Jesus Nieves");
		PersonSingleton.getInstance().setAge(24);

		Person person1 = new Person();
		person1.setName("Jesus");
		Person person2 = person1.getClone();

		System.out.println(person1.getName());
		System.out.println(person2.getName());
//		System.out.println("Singleton ID ->" + (((Person) context.getBean("personSingleton")).getName()));
//		System.out.println("Singleton ID ->" + context.getBean("personSingleton").hashCode());
//		System.out.println("Singleton ID ->" + context.getBean("personSingleton").hashCode());
//		System.out.println("Singleton ID ->" + context.getBean("personSingleton").hashCode());
		PersonDecorator person3 = new PersonDecorator(person2);
		System.out.println(person3.getName());
		System.out.println("---------------");
		Proxy person4 = new Proxy(person1);
		person4.Operacion();
		System.out.println("---------------");
		Unit soldado = new Unit("soldado");
		Unit sargento = new Unit("sargento", soldado);
		Unit capitan = new Unit("capitan", sargento);
		capitan.executeCommand("Accion");
		
	}

}
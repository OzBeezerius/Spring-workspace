package com.everis.bootcamp.observador;

import reactor.core.publisher.Flux;

public class ReactorApplication {

	public static void main(String[] args) {
		
		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		messageSender.subscribe(i -> System.out.println("Reactor. Recibido: " + i));
	}

}

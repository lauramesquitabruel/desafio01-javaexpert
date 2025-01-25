package com.bruel.desafio01;

import com.bruel.desafio01.entities.Order;
import com.bruel.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Código: ");
		Integer code = sc.nextInt();

		System.out.println("Valor: ");
		Double basic = sc.nextDouble();

		System.out.println("Valor: ");
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + code + "\nValor total: " + orderService.total(order));
	}
}

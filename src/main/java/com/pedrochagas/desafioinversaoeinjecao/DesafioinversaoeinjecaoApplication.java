package com.pedrochagas.desafioinversaoeinjecao;

import com.pedrochagas.desafioinversaoeinjecao.entities.Order;
import com.pedrochagas.desafioinversaoeinjecao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioinversaoeinjecaoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioinversaoeinjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Integer orderCode = scanner.nextInt();
		Double orderBaseValue = scanner.nextDouble();
		Double orderDiscountPercentage = scanner.nextDouble();

		Order order = new Order(orderCode, orderBaseValue, orderDiscountPercentage);
		Double orderTotalValue = orderService.total(order);

		System.out.printf("Pedido Codigo: %d\nValor Total: R$ %.2f", orderCode, orderTotalValue);

		scanner.close();
	}
}

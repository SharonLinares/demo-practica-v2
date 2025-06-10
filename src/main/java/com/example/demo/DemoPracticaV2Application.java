package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.VentaController;
import com.example.demo.dto.VentaDto;

@SpringBootApplication
public class DemoPracticaV2Application {

	public static void main(String[] args) {

		VentaDto ventaDto = new VentaDto("camara", 2, 10, "02A");

		VentaController ventaController = new VentaController();
		ventaController.crearVenta(ventaDto);
		ventaController.crearVenta(new VentaDto("monitor", 3, 10, "04A"));

		ventaController.imprimirVentas();

	}

}

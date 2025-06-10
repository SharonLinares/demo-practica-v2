package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.VentaDto;

public class VentaController {
	
	private List<VentaDto> ventas = new ArrayList<>();
	
	public void crearVenta(VentaDto ventadto) {
		this.ventas.add(ventadto);
	}
	
	

	public void imprimirVentas() {
		for (VentaDto ventaDto : ventas) {
			System.out.println(ventaDto.getNombreProducto());
			System.out.println(ventaDto.getCantidad());
			System.out.println(ventaDto.getValorUnitario());
			System.out.println(ventaDto.getValorTotal());
		}
	}
	
	public static void main(String[] args) {
		
		VentaController ventaController = new VentaController();
		
		VentaDto v = new VentaDto("mause",2, 10, 20);
		VentaDto v2 = new VentaDto("teclado",2, 15, 30);
		VentaDto v3 = new VentaDto("monitor",2, 9, 18);
		
		
		ventaController.crearVenta(v);
		ventaController.crearVenta(v2);
		ventaController.crearVenta(v3);
		ventaController.imprimirVentas();
		
	}

}

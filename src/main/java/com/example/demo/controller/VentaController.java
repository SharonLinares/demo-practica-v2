package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.VentaDto;

public class VentaController {
	
	private List<VentaDto> ventas = new ArrayList<>();
	
	
	public void crearVenta(VentaDto ventadto) {
		this.ventas.add(ventadto);
	}
	
	
	// 	public VentaDto(String nombreProducto, int cantidad, double valorUnitario, double valorTotal) {
	public void imprimirVentas() {
		for (VentaDto ventaDto : ventas) {
			System.out.println(ventaDto.getNombreProducto());
			System.out.println(ventaDto.getCantidad());
			System.out.println(ventaDto.getValorUnitario());
			System.out.println(ventaDto.getValorTotal());
		}
	}

}

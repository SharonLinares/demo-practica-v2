package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.VentaDto;

public class VentaController {

	private List<VentaDto> ventas = new ArrayList<>();

	public void crearVenta(VentaDto ventadto) {
		VentaDto ventaDtoCompletada = consultarVentaPorCodigo(ventadto.getCodigo());
		if (ventaDtoCompletada == null) {
			double valorTotal = ventadto.getCantidad() * ventadto.getValorUnitario();
			ventadto.setValorTotal(valorTotal);
			this.ventas.add(ventadto);

		} else {
			System.out.println("este codigo ya existe: " + ventadto.getCodigo());
		}

	}

	public void imprimirVentas() {
		for (VentaDto ventaDto : ventas) {
			System.out.println("nombre del producto: " + ventaDto.getNombreProducto());
			System.out.println("cantidad del producto: " + ventaDto.getCantidad());
			System.out.println("valor unitario: " + ventaDto.getValorUnitario());
			System.out.println("valor total del producto: " + ventaDto.getValorTotal());
			System.out.println("codigo  del producto: " + ventaDto.getCodigo());
			System.out.println("****************************");
		}
	}

	public VentaDto consultarVentaPorCodigo(String codigo) {
		for (VentaDto ventaDto : ventas) {
			if (ventaDto.getCodigo().equals(codigo)) {
				return ventaDto;

			}

		}
		return null;

	}

}

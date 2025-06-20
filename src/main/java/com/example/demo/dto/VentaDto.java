package com.example.demo.dto;

public class VentaDto {

	private String nombreProducto;
	private int cantidad;
	private double valorUnitario;
	public double valorTotal;
	private String codigo;

	public VentaDto(String nombreProducto, int cantidad, double valorUnitario, String codigo) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.codigo = codigo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}

package Ejercicio01;

import java.time.LocalDate;

public class Venta {
	private String nombreCliente;
	private LocalDate fecha;
	private double montoTotal;
	Producto prod;
	public Producto getProducto() {
		return prod;
	}
	
	public double getMonto() {
		return montoTotal;
	}


	
}
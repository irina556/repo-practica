package Ejercicio01;

import java.util.ArrayList;

public class Viajante extends Empleado implements Comisionable {
	private int cantidadClientesVisitados;
		
	public double pagoComision() {
		double cobro=0;
		double montoTotalVentas=0;
		for(int i=0;i<ventas.size();i++) {
			if(ventas.get(i).getProducto().getTipo()=="veterinario") {
				cobro+=(20*ventas.get(i).getMonto())/100;
			}
			else {
				cobro+=(10*ventas.get(i).getMonto())/100;
			}
			montoTotalVentas+=ventas.get(i).getMonto();
		}
		cobro+=1000*cantidadClientesVisitados;
		double superaMonto=(20*cobro)/100;
		if(montoTotalVentas>valorObjetivo) {
			cobro+=superaMonto;
		}
		return cobro;
	}
}


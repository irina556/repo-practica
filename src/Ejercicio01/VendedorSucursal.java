package Ejercicio01;

import java.util.ArrayList;

public class VendedorSucursal extends Empleado implements Comisionable {
	private ArrayList<Cliente> clientes= new ArrayList<>();
	
	
	public double pagoComision() {
		double cobro=0;
		double montoTotal=0;
		for(int i=0;i<ventas.size();i++) {
			if(ventas.get(i).getProducto().getTipo()=="veterinario") {
				cobro+=(25*ventas.get(i).getMonto())/100;
			}
			else {
				cobro+=(20*ventas.get(i).getMonto())/100;
			}
			montoTotal+=ventas.get(i).getMonto();
		}
		for(int i=0;i<clientes.size();i++) {
			if(i%20==0) {
				cobro+=5000;
			}
		}
		double superaMonto=(10*cobro)/100;
		if(montoTotal>valorObjetivo) {
			cobro+=superaMonto;
		}
		return cobro;
	}
	
}

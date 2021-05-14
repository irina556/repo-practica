package Ejercicio01;

public class VendedorOnline extends Empleado implements Comisionable{
	private int contactosConClientes;
	
	
	public double pagoComision() {
		double cobro=0;
		double montoTotal=0;
		for(int i=0;i<ventas.size();i++) {
			cobro+=(5*ventas.get(i).getMonto())/100;
			montoTotal+=ventas.get(i).getMonto();
		}
		if(contactosConClientes%100==0) {
			cobro+=1000;
		}
		double superaMonto=(20*cobro)/100;
		if(montoTotal>valorObjetivo) {
			cobro+=superaMonto;
		}
		return cobro;
	}
}

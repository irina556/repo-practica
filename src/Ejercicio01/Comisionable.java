package Ejercicio01;

public interface Comisionable {
	public default double pagoComision() {
		return 0;
		
	}
}

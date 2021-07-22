package ejemplos.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class CalcularOperacionesFigura {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		OperacionesFigura of = new Triangulo("Triangulo", "Azul", 15.0, 3.0);
		OperacionesFigura of2 = new Circulo("Circulo", "Verde", 12.3);
		List<OperacionesFigura> lista = new ArrayList<OperacionesFigura>();
		lista.add(of);
		lista.add(of2);
		calcularArea(lista);
}

	public static void calcularArea(List<OperacionesFigura> listaOperacionesFiguras) {
		for (OperacionesFigura of : listaOperacionesFiguras) {
		System.out.println("Area es:  " + of.calcularArea());
		System.out.println("Nombre es: " + of.figura().getNombre());
		System.out.println("Color es: " + of.figura().getColor());
		System.out.println("");
		}
}
}

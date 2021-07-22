import java.util.Scanner;

public class PrecioIvaTest {

	public static void main(String[] args) {
		PrecioIva p = new PrecioIva();
		try (Scanner sc = new Scanner (System.in)) {
			double precio;
			System.out.println("Digame el precio: ");
			precio = sc.nextDouble();
			double resultado = p.precioIva(precio);
			System.out.println(resultado);
		}
	}

}

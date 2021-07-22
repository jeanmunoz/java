// Hacer un programa que pida la hora en formato de numeros enteros 0-24H y de acuerdo
// a la hora introducida por el usuario de una saludo de buenos dias, buenas tardes o buenas noches
import java.util.Scanner;

public class SaludoHoraTest {

	public static void main(String[] args) {
		SaludoHora pro = new SaludoHora();
		try (Scanner sc = new Scanner (System.in)) {
			int hora;
			System.out.println("Digame la hora: ");
			hora = sc.nextInt();
			String resultado = pro.saludoHora(hora);
			System.out.println(resultado);
		}

	}

}

//2.- Hacer un programa que pida el nombre y el apellido de un estudiante y la nota obtenida en un examen
//    y de acuerdo a la nota indique si aprobo o no el examen.
import java.util.Scanner;

public class NombreNotaTest {

	public static void main(String[] args) {
	
		NombreNota nn = new NombreNota();
		try (Scanner sc = new Scanner (System.in)) {
			String nombre;
			System.out.println("Digame su Nombre: ");
			nombre = sc.nextLine();
			String apellido;
			System.out.println("Digame su Apellido: ");
			apellido = sc.nextLine();
			int nota;
			System.out.println("Digame la Nota: ");
			nota = sc.nextInt();
			String resultado = nn.nombreNota(nombre, apellido, nota);
			System.out.println(resultado);
		}

	}

}

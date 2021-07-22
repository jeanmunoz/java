
public class NombreNota {
	public String nombreNota(String nombre, String apellido, int nota) {
		String resultado;
		if(nota>0 && nota<4) {
			resultado="Reprobado";return "Resultado: "+nombre+" "+apellido+" ud. ha sido "+resultado;
			}
		else if(nota>=4 && nota<=7) {
			resultado="Aprobado";return "Resultado: "+nombre+" "+apellido+" ud. ha sido "+resultado;
			}
		else{
			resultado="Nota no Valida";return "Resultado: Nota NO valida";
			}
	
	}
}

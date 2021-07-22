
public class SaludoHora {
	public String saludoHora(int hora) {
		if (hora >=12 && hora<=19) {
			return "Buenas Tardes";
		}
		else if (hora>0 && hora<12){
			return "Buenos Dias";
		}
		else if (hora<=24 && hora>19){
			return "Buenas Noches";
		}
		else {
			return "Hora no valida!";
		}
	}

}

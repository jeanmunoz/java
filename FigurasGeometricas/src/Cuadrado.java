
public class Cuadrado {
	
	private int lado1;
	private int lado2;
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	void areaCuadrado() {
		int areaCuadrado = (lado1*lado2);
		System.out.println("El Area del Cuadrado, para un lado "+lado1+" y para el otro lado "+lado2+" es: "+areaCuadrado);
	}

}

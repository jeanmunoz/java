
public class Circulo {
	
	private int radio;
	private double PI= 3.14;
	
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	//SOLO CREO get PI, pues no puede ser modificado
	public double getPI() {
		return PI;
	}
	
	void areaCirculo() {
		double areaCirculo = (PI*radio*radio);
		System.out.println("El Area del Circulo, para un radio "+radio+" es: "+areaCirculo);
	}

}

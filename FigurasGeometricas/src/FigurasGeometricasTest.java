
public class FigurasGeometricasTest {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		Cuadrado c1 = new Cuadrado();
		Circulo cc = new Circulo();
		
		t1.setAltura(23);
		t1.setBase(15);
		System.out.println("El Area del Triangulo, para la base "+t1.getBase()+" y para la atura "+t1.getAltura()+" es: "+t1.areaTriangulo());
		
		c1.setLado1(10);
		c1.setLado2(20);
		c1.areaCuadrado();
		
		cc.setRadio(10);
		cc.areaCirculo();

	}

}
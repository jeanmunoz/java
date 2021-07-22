public class Triangulo {
	
private double base;
private double altura;
private String color;
private String nombre;



public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}

public double areaTriangulo() {
	double areaTriangulo = (base*altura)/2;
	return areaTriangulo;
	//System.out.println("El Area del Triangulo, para la base "+base+" y para la atura "+altura+" es: "+areaTriangulo);
	
}

}

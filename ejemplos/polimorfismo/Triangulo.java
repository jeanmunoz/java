package ejemplos.polimorfismo;

public class Triangulo extends Figura implements OperacionesFigura {

	private double base;

	private Double altura;

	public Triangulo(String nombre, String color, double base, Double altura) {

		super(nombre, color);
		this.base = base;
		this.altura = altura;

	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Figura figura() {
		return new Figura(getNombre(), getColor());
	}

}

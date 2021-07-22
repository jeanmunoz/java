package com.ejemplos;

public class EjecutivoVentas extends Empleado {

	private double presupuesto;
	
	public EjecutivoVentas(String nombre, String apellidos, int edad, double sueldo) {
		super(nombre,apellidos, edad, sueldo);		
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
}

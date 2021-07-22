package com.ejemplos;

public class Empleado extends Persona{

	public Empleado(String nombre, String apellidos, int edad, double sueldo) {
		super(nombre, apellidos, edad);
		this.sueldo = sueldo;		
	}
	
	
	private double sueldo;
	private Departamento departamento;
	private Empleado persona;
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Empleado getPersona() {
		return persona;
	}
	public void setPersona(Empleado persona) {
		this.persona = persona;
	}
	
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", departamento=" + departamento
				+ ", persona=" + persona + "]";
	}
	
	
	
	
}

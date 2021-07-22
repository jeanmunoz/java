package com.benllisoft.Ejercicios2;


/* Modificadores de Acceso Clases
 * 
 * DEFAULT: Si no elegimos ning�n modificador, se usa el de por defecto, que s�lo puede ser accedido por clases que est�n en el mismo paquete.
 * 
 * PUBLIC: Este nivel de acceso permite a acceder al elemento desde cualquier clase, independientemente de que esta pertenezca 
 *         o no al paquete en que se encuentra el elemento.
 *         
 * PRIVATE:  Es el modificador m�s restrictivo y especifica que los elementos que lo utilizan s�lo pueden ser accedidos desde la misma clase en la que se encuentran. Este modificador s�lo puede utilizarse sobre los miembros de una clase y sobre interfaces y clases internas,
 *            no sobre clases o interfaces de primer nivel, dado que esto no tendr�a sentido.
 * 
 * PROTECTED: Indica que los elementos s�lo pueden ser accedidos desde su mismo paquete y desde cualquier clase que extienda la clase en que se encuentra, independientemente de si esta se encuentra en el mismo paquete o no. Este modificador,
 *            como private, no tiene sentido a nivel de clases o interfaces no internas.
 *            
 * FINAL: Indica que una variable, m�todo o clase no se va a modificar, lo cu�l puede ser �til para a�adir m�s sem�ntica, por cuestiones de rendimiento, y para detectar errores.

		- Si una variable se marca como final, no se podr� asignar un nuevo valor a la variable.
		- Si una clase se marca como final, no se podr� extender la clase.
		- Si es un m�todo el que se declara como final, no se podr� sobreescribir.
		
 *  STATIC: En ocasiones es necesario o conveniente generar elementos que tomen un mismo valor para cualquier n�mero de instancias generadas o bien
            invocar/llamar m�todos sin la necesidad de generar instancias, y es bajo estas dos circunstancias que es empleado el calificador static.

            Dos aspectos caracter�sticos de utilizar el calificador static en un elemento Java son los siguientes: 
			- No puede ser generada ninguna instancia (uso de new) de un elemento static puesto que solo existe una instancia.			
			- Todos los elementos definidos dentro de una estructura static deben ser static ellos mismos, o bien, poseer una instancia ya definida
			  para poder ser invocados
 * 
 * 
 */

public class ModificadoresAcceso {
		
	private String nombre="Angel";
	String apellido = "Duarte";
	public int edad = 30;
	final String cedula = "14782662";
	
	public String getName(){
		
		return nombre;
	}
	
	public void setName (String name){
		
		this.nombre = name;
	}
	
	public void saludar(){
		
		System.out.println("Hola: "+nombre);
	}
	
}

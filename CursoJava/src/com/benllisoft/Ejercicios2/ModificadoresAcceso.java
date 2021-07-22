package com.benllisoft.Ejercicios2;


/* Modificadores de Acceso Clases
 * 
 * DEFAULT: Si no elegimos ningún modificador, se usa el de por defecto, que sólo puede ser accedido por clases que están en el mismo paquete.
 * 
 * PUBLIC: Este nivel de acceso permite a acceder al elemento desde cualquier clase, independientemente de que esta pertenezca 
 *         o no al paquete en que se encuentra el elemento.
 *         
 * PRIVATE:  Es el modificador más restrictivo y especifica que los elementos que lo utilizan sólo pueden ser accedidos desde la misma clase en la que se encuentran. Este modificador sólo puede utilizarse sobre los miembros de una clase y sobre interfaces y clases internas,
 *            no sobre clases o interfaces de primer nivel, dado que esto no tendría sentido.
 * 
 * PROTECTED: Indica que los elementos sólo pueden ser accedidos desde su mismo paquete y desde cualquier clase que extienda la clase en que se encuentra, independientemente de si esta se encuentra en el mismo paquete o no. Este modificador,
 *            como private, no tiene sentido a nivel de clases o interfaces no internas.
 *            
 * FINAL: Indica que una variable, método o clase no se va a modificar, lo cuál puede ser útil para añadir más semántica, por cuestiones de rendimiento, y para detectar errores.

		- Si una variable se marca como final, no se podrá asignar un nuevo valor a la variable.
		- Si una clase se marca como final, no se podrá extender la clase.
		- Si es un método el que se declara como final, no se podrá sobreescribir.
		
 *  STATIC: En ocasiones es necesario o conveniente generar elementos que tomen un mismo valor para cualquier número de instancias generadas o bien
            invocar/llamar métodos sin la necesidad de generar instancias, y es bajo estas dos circunstancias que es empleado el calificador static.

            Dos aspectos característicos de utilizar el calificador static en un elemento Java son los siguientes: 
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

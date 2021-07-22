package com.benllisoft;

public class Operadores {
	
	
	/*RELACION: Metodo para evaluar operadores matemáticos de relación:
	  son operadores para comparar valores, de esta comparación se crea una variable booleana.
	  Operador	Descripción
		==		igual a
		!=		distinto a
		>		mayor que
		<		menor que
		>=		mayor o igual que
		<=		menor o igual que
	 */
	public void operadoresRelacion(){
		
		int operador1=10;
		 
        int operador2=20;
 
        int operador3=10;
 
        boolean resultado;
 
        resultado = operador1==operador2; // ¿10 es igual a 20? resultado = false
        System.out.println("operador == "+resultado);
 
        resultado = operador1==operador3; // ¿10 es igual a 10? resultado = true
        System.out.println("operador == "+resultado);
 
        resultado = operador1!=operador2; // ¿10 es distinto a 20? resultado = true
        System.out.println("operador != "+resultado);
 
        resultado = operador1>operador2; // ¿10 es mayor que 20? resultado = false
        System.out.println("operador > "+resultado);
 
        resultado = operador1>operador3; // ¿10 es mayor que 10? resultado = false (si no cumple la condicion sera falso)
        System.out.println("operador > "+resultado);
 
        resultado = operador1<operador2; // ¿10 es menor que 20? resultado = true
        System.out.println("operador < "+resultado);
        
        resultado = operador1<=operador3; // ¿10 es menor o igual que 10? resultado = true (ya que es igual)         resultado = operador1>=operador2; // ¿10 es mayor o igual que 20? resultado = false
 		System.out.println("operador <= "+resultado);

	}
	
	
	/*RELACION: Unarios: requieren un solo operando, existe  el operador ++ y –.
      Es similar a sumar o restar una unidad a la variable. Tener en cuenta que el orden del operador es importante
    */
	public void operadoresUnarios(){
		
		int operador=10;
        int x=0;
        operador++; //operador = 11
        System.out.println("valor: "+operador);
        
        operador++; //operador = 12
        System.out.println("valor: "+operador);
        
        operador--; //operador = 11
        System.out.println("valor: "+operador);
 
        x=operador++; //x = 11, operador = 12
        System.out.println("valor: "+x);
 
        x=++operador; //x = 13, operador = 13
        System.out.println("valor: "+operador);
	}
	
	
	/*Aritmético: permiten operar con números como sumar, restar, etc. Se pueden sumar variables que almacenen números 
	 
		Operador	    Función
			+			Suma dos valores. En String, significa concatenar dos cadenas.
			-			Resta dos valores.
			*			Multiplica dos valores.
			/			Divide dos valores.
			%			Significa módulo, devuelve el resto de una división
	 */	
	public void operadoresAritmeticos(){		
		
		int operador1 = 20;
        int operador2 = 15;
        int resultado=0;
 
        resultado= operador1+operador2; //resultado = 35
        System.out.println("resultado: "+resultado);
 
        resultado= operador1-operador2; //resultado = 5
        System.out.println("resultado: "+resultado);
 
        resultado= operador2-operador1; //resultado = -5
        System.out.println("resultado: "+resultado);
 
        resultado= operador1*operador2; //resultado = 300
        System.out.println("resultado: "+resultado);
 
        resultado= operador1/operador2; //resultado = 1 (como es int no incluye decimales)
        System.out.println("resultado: "+resultado);
 
        resultado= operador1%operador2; //resultado = 5 (el resto de la division)
        System.out.println("resultado: "+resultado); 
	}
	
	
	/*
	 Asignación: asigna un valor a una variable.
	 El operador de asignación es =, una vez asignado podemos reasignar de nuevo otro valor
	 
	 */
	public void operadoresAsignacion(){
		
		int a=30;
		System.out.println("Valor a: "+a);
        boolean exito=true;
		System.out.println("Valor exito: "+a);
		a=40;
		System.out.println("Valor a: "+a);
        exito=false;
		System.out.println("Valor exito: "+a);
		
	}
	
	
	/* Condicional: son operadores que permiten concatenar mas de una condición. Los operadores son:
	 
	 Operador		Descripción
		&&				Es equivalente a AND. Si se cumplen todas las condiciones, devuelve true. Si solo hay una condición que no se cumple, devuelve falso.
		||				Es equivalente a OR. Si se cumple alguna de las condiciones, devuelve true. Si todas las condiciones son falsas, devuelve falso.

	*/
	public void operadoresCondicionales(){
		
		int op1=10;
		 
        int op2=20;
 
        int op3=10;
 
        boolean result;
 
        result = op1==10 && op2<30;
        // ¿Es 10 igual a 10 y es 20 menor que 30? resultado = 
        System.out.println("resultado "+result);
 
        result = op1!=30 || op3==15;
        // ¿Es 10 distinto a 30 o es 10 igual a 15? resultado = 
        System.out.println("resultado "+result);

 
        result = op1==op3 && op2<=30 || op2>=15;
        // ¿Es 10 igual que 10 y es 20 menor que 30 o es 10 mayor o igual que 15? resultado = 
        // Aqui primero se evalua las condiciones con && y el resultado de esta se compara con ||
        System.out.println("resultado "+result);

		
	}

}

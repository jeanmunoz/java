package com.benllisoft;

public class EstructurasControl {
	
	
	/* IF - Valida el cumpleimiento de una condicion y retorna True o False */
	public void condicionalIf(){		
		int numero=5;		
		if (numero==5){
			System.out.println("Numero es igual 5");
		}else{
			System.out.println("Numero no es igual 5");
		}		
		
	}
	
	
	public void condicionalIfAnidado(){
		
		String sexo="Mujer";
        int edad = 29;
	       if (sexo.equals("Mujer")){
	           if (edad <30){	   
	           System.out.println("Eres mujer y tienes menos de 30 anos  ");
	           }
	       else{
	           System.out.println("Eres mujer pero con mas de 30 anos  ");	   
	          }
	         }
	         else{
	           System.out.println("Eres un hombre ");	   
	         }	
	}
	
	
	
	/* IF - Valida el cumpleimiento de una condicion y retorna True o False */
	public void condicionalWhile(){		
		 
		int x=0;
		while(x!=10)
		  {
			x++;
			System.out.println("Vuelta:"+x);
		  }		
	}
	
	//Uso del switch
	public void condicionalSwitch(){
		
		int x=10;		
		switch (x)
			{
			case 10: { System.out.println("10! xD");} // Si es igual a 10 cumple la condicion
			break; // Sirve para detener la evaluación de las condiciones y salir del switch
			default: System.out.println("Distinto de 10! xD");
			break;
		}		
	}
	
	// 
	public void condicionalDoWhile(){	
		
		int x=0; 
		//Uso del Do-While
		do{
			System.out.println("Número: "+x);
			x++;
		   } while(x!=10);
		
	}
	
	
	
	
	
	
	
	
	
	

}

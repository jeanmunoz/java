package com.benllisoft;

public class VariablesPrimitivas {
	
	/*	 
	
	Tipo     Descripcion  	        				Ejemplo 				Rango 				 valores 
	
	long     Representa a un número         		long a=40000000;      -263 a 263-1
	 		 entero real. Usa 8 bytes.	    		long b=646334578;
	 												long c=-32356;			
	        
	int      Representa a un número entero real.   		int a=-1;             -231 a 231-1
	         Usa 4 bytes. Es el mas usado          	 	int b=5;
		 												int c=30000;
	
	
	short    Representa a un número entero real.    	short a=20;            -32768 a 32767
	         Es compatible con short. Usa 2 bytes.  	short b=300;
														short c=-30000;
	
	byte     Representa a un número entero real.    	byte a=30;             -128 a 127
	 		 Usa 1 byte.                            	byte b=126;
												    	byte c=-120;
	
	
	double   Representa a un numero de coma flotante,   double a=5.5;         -1,79 * 10308 a 1,79 * 10308
	         es compatible con una variable con un      double b=30;
	         entero real pero este no lo es con double. double c=30.0;
	         Usa 4 bytes.
	
	float    Representa a un número real.               float a=4.55555;      -3,4 · 1038 a 3,4 · 1038
	         Pasa igual que con double. Usa 4 bytes.    float b=-1.8521;
	         											float c=600.152;
	
	boolean  Solo puede contener true o false.          boolean a=true;        true o false
	 		 Se usa para condiciones lógicas.           boolean b=false;
	 		 Usa 2 bytes
	
	char     Representa un numero, letra o simbolo      char a='A';
	         segun la tabla ASCII. Es compatible con    char b=97; (corresponde a la letra a de la tabla ASCII)
	         un numero entero real. Si es un caracter,  char c='!';
	         va entre comillas simples. Usa 2 bytes
	
	*/	
	
	public void variablesPrimitivas(){
		
		 int a=30; 
		 int b=60;
		 short c=20;
	     int suma=a+b+c;
	     System.out.println(suma);
	     
	     
	     int x=30;
	     double y=30.5;
	     double suma2=x+y; //si fuera un int daria error
	     System.out.println(suma2);
		
	}
	
}

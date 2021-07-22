
public class Cadenas {

	public static void main(String[] args) {
		
		//length - Las cadenas tienen un m�todo para determinar su longitud.
		String ninja = "Coding Dojo es Incre�ble!";
        int length = ninja.length();
        System.out.println( "La longitud de la cadena es : " + length );
        
       //concat - Un m�todo de las cadenas que permite unir dos cadenas. 
        //Como cada cadena es inmutable, esto da como resultado una nueva cadena. 
        String cadena1 = "Mi nombre es ";
        String cadena2 = "Michael";
        String cadena3 = cadena1.concat(cadena2);
        System.out.println(cadena3);
        
        //El signo �+� es utilizado para la misma funci�n.
        String cadena4 = "Bienvenido," + " ninja" + "!";
        System.out.println(cadena4);

        //format - �Otra manera de unir cadenas!
        String ninjax = String.format("Hola %s, me debes $%.2f !", "Jack", 25.0);
        System.out.println(ninjax);
        //Imprimir� Hola Jack, me debes $25.00 !
        //En el lugar de %s se espera una cadena.
        //En el lugar de %.2f se esper� un dato de tipo float. El n�mero 2 indica que se colocar�n dos 
        //n�meros a la derecha del punto decimal.
        
        //indexOf - El m�todo indexOf busca de izquierda a derecha dentro de una cadena dada una cadena �objetivo�. 
        //El m�todo indexOf() devuelve el �ndice (n�mero de la posici�n) donde empieza por primera vez la cadena �objetivo� o 
        //devuelve -1 si no la encuentra.
        String ninjaxx = "Bienvenido a Coding Dojo!";
        int a = ninjaxx.indexOf("Coding"); // a es 13
        int b = ninjaxx.indexOf("do"); // b es 8
        int c = ninjaxx.indexOf("pizza"); // c es -1, "pizza" no ha sido encontrado.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //trim - El m�todo trim elimina todos los espacios en blanco al principio y al final de la cadena.
        String sentence = "   espacios en todos lados!   ";
        System.out.println(sentence.trim()); //espacios en todos lados!
        
        //UpperCase y LowerCase - La clase String provee m�todos para convertir a min�sculas y may�sculas las cadenas.
        String aa = "HOLA";
        String bb = "mundo";
        System.out.println(aa.toLowerCase()); // hola
        System.out.println(bb.toUpperCase()); // MUNDO
        
        //Igualdad - Podemos comparar la igualdad entre cadenas de dos maneras. Referirnos al mismo objeto o 
        //a que tienen la misma secuencia de caracteres.
        String aaa = new String("palabra");
        String bbb = new String("palabras");
        //Int ccc = new Int (135);
        //Int ddd = new Int (135);
        System.out.println(aaa == bbb); // Falso. No son el mismo objeto.
        System.out.println(aaa.equals(bbb)); // Verdadero. Tienen exactamente los mismos caracteres.
        //System.out.println(ccc == ddd);
        //System.out.println(ccc.equals(ddd));
	}

}


public class LanzaException {
	
    public static void main (String [] args)     {

    	try {
			ejecutarnsstruccion();
		} catch (MiError e) {
			e.printStackTrace();
		}

    }
    
    public static  void ejecutarnsstruccion() throws MiError{    	
          System.out.println("Instrucciones a ejecutar cuando se produce un error");        
    }

}

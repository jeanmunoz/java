
public class SumaParesImpares {
	
	public void sumaParesImpares() {
	int sumapar=0;
	int sumaimpar=0;
	for(int i=0;i<=50;i++) {
		
		if(i%2==0) {
			sumapar = sumapar + i;
		}
		else {sumaimpar= sumaimpar + i;}
		
		
	}System.out.println("La suma de pares del 1 al 50 es "+sumapar+", y la suma de impares es "+sumaimpar);
		}
	

}

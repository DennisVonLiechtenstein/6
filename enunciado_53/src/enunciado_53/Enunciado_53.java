package enunciado_53;

public class Enunciado_53 {
    
public int divisiveis_5(int numero) {
		
	 int resul=0;
	 int[] guarda = new int[5000];
	 	
	 for(int i=5;i<=numero;i++) {
		if(i % 2 != 0 && i % 5 == 0) {
			resul=i*i++;
			
			/*guarda[i]=i;
			resul=guarda[i] * guarda[i++];*/
			
		 }
				
	  }
	    return resul ;
   }
}
     

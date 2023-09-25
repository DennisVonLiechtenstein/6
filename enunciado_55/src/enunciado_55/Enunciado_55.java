package enunciado_55;

public class Enunciado_55 {

	public boolean verifica(int num1,int num2) {
		boolean divisivel=false;
		if(num1 > 0 && num2 > 0 && num1 % num2==0) {
			divisivel=true;
			
		}else if(num1 > 0 && num2 > 0 && num2 % num1==0) {
			divisivel=true;
		}
		
		
		
		
		return divisivel;
				
	}
	
	
	
}

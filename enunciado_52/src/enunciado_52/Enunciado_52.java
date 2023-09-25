package enunciado_52;

public class Enunciado_52 {
	public double media(double nota1,double nota2,double nota3,int peso1,int peso2,int peso3) {
		double resul=0;
		if(nota1  < 0 || nota2 < 0 || nota3 < 0 && peso1 < 0 || peso2 < 0 || peso3 < 0) {
			System.out.println("Apenas e aceitavel valores positivos!");
		}else {
		double passo1=nota1*peso1;
		double passo2=nota2*peso2;
		double passo3=nota3*peso3;
		double somaDospassos=passo1+passo2+passo3;
		double somaDosPesos=peso1+peso2+peso3;
		resul=somaDospassos/somaDosPesos;
		}
		return resul;
	}
	
}

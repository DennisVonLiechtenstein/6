package enunciado51;

import java.util.Scanner;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Worker {

	public static void main(String[] args) {
		
		Scanner scaneia = new Scanner(System.in);
		System.out.println("Digite um valor real:");
		double numero=scaneia.nextDouble();
		String condicao=" ";
		if(numero > 0 ) {
			condicao="Positivo";
		}else {
			condicao="Negativo";
		}
		
		System.out.println("Esse numero e um numero "+condicao+"!");
		
        @Test
		assertTrue();
	}

}

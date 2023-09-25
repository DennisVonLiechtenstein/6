package enunciado_51;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class Enunciado_51Test {

	@Test
	void teste() {
	Enunciado_51 enu =new Enunciado_51();  //failure
	String definicao=enu.confere(25);
	String esperado="Negativo";
	assertTrue(esperado==definicao);
	}
	@Test
	void teste1() {
	Enunciado_51 enu =new Enunciado_51();  //ok
	String definicao=enu.confere(-15);
	String esperado="Negativo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste2() {
	Enunciado_51 enu =new Enunciado_51();    //failure
	String definicao=enu.confere(-116.53);
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste3() {
	Enunciado_51 enu =new Enunciado_51();   //ok
	String definicao=enu.confere(20.585);
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste4() {
	Enunciado_51 enu =new Enunciado_51();  //failure
	String definicao=enu.confere(-20+19);
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste5() {
	Enunciado_51 enu =new Enunciado_51();
	String definicao=enu.confere(-20+21);   //ok
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste6() {
	Enunciado_51 enu =new Enunciado_51();  //failure
	String definicao=enu.confere(-10/5);
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste7() {
	Enunciado_51 enu =new Enunciado_51();   //ok
	String definicao=enu.confere(-10/5);
	String esperado="Negativo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste8() {
	Enunciado_51 enu =new Enunciado_51();   //failure
	String definicao=enu.confere(-3*3);
	String esperado="Positivo";
	assertTrue(esperado==definicao);
	
}
	@Test
	void teste9() {
	Enunciado_51 enu =new Enunciado_51();
	String definicao=enu.confere(-3*3);      //ok
	String esperado="Negativo";
	assertTrue(esperado==definicao);
	
}
	
	
	
	
	
}
	

		
	
	



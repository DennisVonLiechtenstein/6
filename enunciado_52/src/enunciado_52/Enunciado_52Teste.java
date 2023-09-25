package enunciado_52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Enunciado_52Teste {

	@Test
	void test() {
		Enunciado_52 enu =new Enunciado_52();                   //ok
		double resultado=enu.media(10.0, 10.0, 10.0, 1, 2, 3);
		double esperado=10.0;
		assertTrue(esperado==resultado);
	}
	@Test
	void test1() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(10.0, 10.0, 10.0, 1, 2, 3);   //failure
		double esperado=11.0;
		assertTrue(esperado==resultado);
	}
	@Test
	void test2() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(10.0, 10.0, 10.0, 1, 2, 3);    //failure
		double esperado=9.0;
		assertTrue(esperado==resultado);
	}
	@Test
	void test3() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(10.0, 15.0, 20.0, 3, 4, 1);   //ok
		double esperado=13.75;
		assertTrue(esperado==resultado);
	}
	@Test
	void test4() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(10.0, 15.0, 20.0, 3, 4, 1);   //failure
		double esperado=13.76;
		assertTrue(esperado==resultado);
	}
	@Test
	void test5() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(10.0, 15.0, 20.0, 3, 4, 1);   //failure
		double esperado=13.74;
		assertTrue(esperado==resultado);
	}
	@Test
	void test6() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(13.0, 14.0, 15.0, 6, 3, 1);   //ok
		double esperado=13.5;
		assertTrue(esperado==resultado);
	}
	@Test
	void test7() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(13.0,14.0,15.0,6,3,1);  //failure
		double esperado=13.6;
		assertTrue(esperado==resultado);
	}
	@Test
	void test8() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(13.0, 14.0, 15.0, 6, 3, 1);   //failure
		double esperado=13.7;
		assertTrue(esperado==resultado);
	}
	@Test
	void test9() {
		Enunciado_52 enu =new Enunciado_52();
		double resultado=enu.media(8.0, 13.0, 30.0, 1, 3, 6);   //ok
		double esperado=22.7;
		assertTrue(esperado==resultado);
	}

}

package enunciado_55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Enunciado_55Teste {

	@Test
	void test() {
		Enunciado_55 enu =new Enunciado_55();      //ok
		boolean confere=enu.verifica(56, 2);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test1() {
		Enunciado_55 enu =new Enunciado_55();       //failure
		boolean confere=enu.verifica(16,84);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test2() {
		Enunciado_55 enu =new Enunciado_55();      //ok
		boolean confere=enu.verifica(46, 2);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test3() {
		Enunciado_55 enu =new Enunciado_55();      //failure
		boolean confere=enu.verifica(156, 8);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test4() {
		Enunciado_55 enu =new Enunciado_55();     //ok
		boolean confere=enu.verifica(2006, 59);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test5() {
		Enunciado_55 enu =new Enunciado_55();    //failure
		boolean confere=enu.verifica(165, 524);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test6() {
		Enunciado_55 enu =new Enunciado_55();    //ok
		boolean confere=enu.verifica(1895, 5);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test7() {
		Enunciado_55 enu =new Enunciado_55();     //failure
		boolean confere=enu.verifica(154, 1672);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test8() {
		Enunciado_55 enu =new Enunciado_55();      //ok
		boolean confere=enu.verifica(843, 3);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}
	@Test
	void test9() {
		Enunciado_55 enu =new Enunciado_55();     //failure
		boolean confere=enu.verifica(4582, 129);
		boolean esperado=true;
		assertTrue(esperado==confere);
	}

}

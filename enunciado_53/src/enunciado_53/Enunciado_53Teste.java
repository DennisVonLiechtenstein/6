package enunciado_53;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Enunciado_53Teste {

	@Test
	void test() {
		Enunciado_53 enu =new Enunciado_53();
		int numEscolhido=enu.divisiveis_5(15);
		int esperado=75;
		assertTrue(esperado == numEscolhido);
	}

}

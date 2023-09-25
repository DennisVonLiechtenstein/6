package enunciado_54;

public class Enunciado_54 {
public int fatorial(int resultadofatorial) {
	 int numero = 0;
     int fatorial = 1;
     
     while (fatorial < resultadofatorial) {
         numero++;
         fatorial *= numero;
     }
     
     if (fatorial == resultadofatorial) {
         System.out.println("O resultado " + resultadofatorial + " pertence ao fatorial de " + numero);
     } else {
         System.out.println("O resultado " + resultadofatorial + " não corresponde a nenhum fatorial.");
     }
	return resultadofatorial;
}
}

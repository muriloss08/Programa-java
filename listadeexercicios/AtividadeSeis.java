package listadeexercicios;
import  java.util.Scanner;
public class AtividadeSeis {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um numero inteiro: ");
	int numero = entrada.nextInt();
	double triploNumero = numero *3;
	double metade = numero / 2.0;
	double raizCubica = Math.cbrt(numero);
	double potencia	  = Math.pow(numero, 2.0/3.0);
	
	System.out.println("Triplo do numero: " + triploNumero);
	System.out.println("Metade do numero: "+ metade);
	System.out.println("Raiz cubica do numero: "+ raizCubica);
	System.out.println("Numero elevado a potencia 2/3: "+ potencia);
	
	entrada.close();
	
	}

}

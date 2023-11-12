package listadeexercicios;
import java.util.Scanner;
public class AtividadeOito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//vamos pedir para o usuario um numero inteiro
		System.out.println("Digite um numero inteiro: ");
		int numero = entrada.nextInt();
		
		int antecessor = numero - 1;
		int sucessor   = numero +1;
		
		System.out.println("O antecessor e sucessor respectivamente de: " + numero + " e igual a: " + antecessor+ " e " + sucessor);
		entrada.close();
	}

}

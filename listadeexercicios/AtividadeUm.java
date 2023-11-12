package listadeexercicios;
import java.util.Scanner;
public class AtividadeUm {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a primeira nota (com peso 2):");
	        int nota1 = scanner.nextInt();

	        System.out.println("Digite a segunda nota (com peso 3):");
	        int nota2 = scanner.nextInt();

	        System.out.println("Digite a terceira nota (com peso 5):");
	        int nota3 = scanner.nextInt();

	        // Calcular a média ponderada
	        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

	        System.out.println("A média ponderada é: " + mediaPonderada);

	        scanner.close();

	}

}

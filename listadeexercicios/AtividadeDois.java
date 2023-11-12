package listadeexercicios;

import java.util.Scanner;
public class AtividadeDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quilometragem inicial em quilometros(km): ");
		double quilometragemInicial = scanner.nextDouble();
		
		System.out.println("Digite a quilometragem final em quilometros(km): ");
		double quilometragemFinal   = scanner.nextDouble();
		
		System.out.println("Digite a quantidade total de gasolina comprada: ");
		double quantidadeGasolina   = scanner.nextDouble();
		
		//Calcular a distacia que foi percorrida 
		double quilometragemPercorrida = quilometragemFinal - quilometragemInicial;
		
		double quilometragemMediaPorLitro = quilometragemPercorrida / quantidadeGasolina;
		
		System.out.println("Voce percorreu " + quilometragemPercorrida);
		System.out.println("O consumo por litro foi de: " + quilometragemMediaPorLitro);
		
		scanner.close();


	}

}

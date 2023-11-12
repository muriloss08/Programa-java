package listadeexercicios;
import  java.util.Scanner;
public class AtividadeSete {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//vamos buscar os dados sobre as coordenadas para isso pedimos para o usuario informar as coordenadas
		System.out.println("Digite a coordenada x1: ");
		double x1 = entrada.nextDouble();
		
		System.out.println("Digite a coordenada y1: ");
		double y1 = entrada.nextDouble();
		
		System.out.println("Digite a coordenada x2: ");
		double x2 = entrada.nextDouble();
		
		System.out.println("Digite a coordenada y2: ");
		double y2 = entrada.nextDouble();
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("A distância entre os pontos (%.2f, %.2f) e (%.2f, %.2f) é %.2f%n", x1, y1, x2, y2, distancia);

        entrada.close();

	}

}

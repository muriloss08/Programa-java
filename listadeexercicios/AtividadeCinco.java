package listadeexercicios;
import  java.util.Scanner;
public class AtividadeCinco {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em graus Celsius: ");
	double gCelsius = entrada.nextDouble();
	
	// formula para converter Fahrenheit
	double fahrenheit = (gCelsius *9/5) + 32;
	
	System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
	
	entrada.close();
	}

}

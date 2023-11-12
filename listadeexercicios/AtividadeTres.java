package listadeexercicios;
import java.util.Scanner;
public class AtividadeTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do piloto: ");
		String nomePiloto = entrada.nextLine();
		
		System.out.println("Digite a distancia percorrida em km: ");
		double distanciaPercorrida = entrada.nextDouble();
		
		System.out.println("Digite o tempo gasto no percuso em horas: ");
		double tempoPercuso = entrada.nextDouble();
		
		double velocidadeMediaKm = distanciaPercorrida / tempoPercuso;
		
		System.out.println("A velocidade media do: " + nomePiloto +"foi: "+ velocidadeMediaKm );
		entrada.close();

	}

}

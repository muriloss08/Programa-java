package listadeexercicios;
import java.util.Scanner;
public class AtividadeNove {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a porcentagem do IPI: ");
		 double ipi = entrada.nextDouble();
		 //dados da peca 1
		 System.out.println("digite o codigo da peca 1: ");
		 String codigo1 = entrada.next();
		
		 System.out.println("Digite o valor unitario da peca 1: ");
		 double valorUnitario1 = entrada.nextDouble();
		 
		 System.out.println("Digite a quantidade da peca 1: ");
		 int qtidade1 = entrada.nextInt();
		 // mesmo codigo mas agora vamos trocar o tipo de peça.
		 System.out.println("digite o codigo da peca 2: ");
		 String codigo2 = entrada.next();
		
		 System.out.println("Digite o valor unitario da peca 2: ");
		 double valorUnitario2 = entrada.nextDouble();
		 
		 System.out.println("Digite a quantidade da peca 2: ");
		 int qtidade2 = entrada.nextInt();
		 
		 double valorTotal = (valorUnitario1 * qtidade1 + valorUnitario2 * qtidade2) *(ipi/100 +1);
		 
		 System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);
		 
		 entrada.close();
	}

}

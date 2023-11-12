package listadeexercicios;
import java.util.Scanner;
public class AtividadeQuatro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//lista dos valores dos produtos ofertados
		double precoChope = 1.80;
		double precoPizzaMista = 25.00;
		double precoCobertura  = 3.50;
		double taxaGarcom = 0.10;
		
		System.out.println("Digite a quantidade de chopes que foram pedidos: ");
		int qtidDeChopes = entrada.nextInt();
		
		System.out.println("Digite a quantidade de coberuturas que foram pedidas: ");
		int qtidDeCobertura = entrada.nextInt();
		
		System.out.println("Digite a quantidade de pessoas: ");
		int qtidDePessoas = entrada.nextInt();
		
		//para calcular o valor que sera pago
		double totalChopes = qtidDeChopes * precoChope;
		double totalPizza  = qtidDeCobertura + precoPizzaMista * precoCobertura;
		double totalConta  = totalChopes + totalPizza;
		
		//para calcular a taxa do garcom
		double taxaDoGarcom = totalConta * taxaGarcom;
		
		double totalPorPessoa = (totalConta + taxaGarcom) / qtidDePessoas; 
		
		System.out.println("A conta total, ja com a taxa do garcom é de: R$"+ (totalConta + taxaDoGarcom));
		System.out.printf("Cada pessoa deve pagar: R$%.2f%n",totalPorPessoa);

		entrada.close();
}
	

}

import java.util.Scanner;

public class SistemaFinanceiro {

	public static void main(String[] args) {

		String nome = "Nome de exemplo";
		String tipoConta = "Corrente";
		double saldo = 1000.00;
		int opcao = 0;
		double valor;

		System.out.println("************************");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Tipo conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("\n*********************** \n");

		String menu = """
				** Digite sua opção **
				1 - Consultar saldo
				2 - Transferir valor
				3 - Receber valor
				4 - Sair
				""";

		Scanner scanner = new Scanner(System.in);

		while (opcao != 4) {
			System.out.println(menu);
			opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.println("Saldo atual: " + saldo + "\n");
			} else if (opcao == 2) {
				System.out.println("Qual o valor que deseja transferir?");
				valor = scanner.nextDouble();
				if (valor > saldo) {
					System.out.println("Valor maior que saldo disponível.");
				} else {
					saldo -= valor;
					System.out.println("Novo saldo: " + saldo + "\n");
				}
			} else if (opcao == 3) {
				System.out.println("Valor recebido: " + saldo);
				valor = scanner.nextDouble();
				saldo += valor;
				System.out.println("Novo saldo: " + saldo + "\n");
			} else if (opcao != 4) {
				System.out.println("Opção inválida\n" );
			}
		}
		scanner.close();
	}
}

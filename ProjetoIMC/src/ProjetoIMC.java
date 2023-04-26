import java.util.Scanner;

public class ProjetoIMC {

	public static void main(String[] args) {

		double peso;
		double altura;
		double imc;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o seu peso:");
		peso = scanner.nextDouble();
		System.out.println("Informe a sua altura:");
		altura = scanner.nextDouble();

		imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Você está saudável.");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está acima do peso.");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Você está com obesidade Grau 1.");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Você está com obesidade Grau 2.");
		} else {
			System.out.println("Você está com obesidade Grau 3.");
		}
		
		System.out.println("imc = " + (int) imc);
		scanner.close();
	}	
}

public class ProjetoTabuada {

	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println();
			System.out.println("Tabuada do número " + multiplicador);
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador + " ");
			}
			System.out.println();
			
		}
	}
}

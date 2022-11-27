
public class Main {

	public static void main(String[] args) {
		
		double soma = 0, S = 1;
		for (int i=1; i<=100; i++) {
			soma += (double) S/i;
		}
		
		System.out.printf("%.2f%n", soma);
	}

}

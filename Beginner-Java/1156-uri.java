import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double soma = 1.0, par = 1;
		for (int i=2; i<=39; i++) {
			
			if (i % 2 != 0) {
				par = par * 2.0;
				soma += (double) i/par;
			}
		}
		
		System.out.printf("%.2f%n", soma);

	}

}

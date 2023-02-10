import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		double soma = 0, media = 0;
		int quantidade = 0;
		for (int i=0; i<6; i++) {
			double n = sc.nextDouble();
			
			if (n>0) {
				quantidade++;
				soma += n;
				media = soma / quantidade;				
			}
		}
		System.out.println(quantidade + " valores positivos");
		System.out.printf("%.1f%n", media);
				
		sc.close();
	}

}

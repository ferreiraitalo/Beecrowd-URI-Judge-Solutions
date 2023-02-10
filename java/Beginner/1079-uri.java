import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double media;
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			double teste1 = sc.nextDouble();
			double teste2 = sc.nextDouble();
			double teste3 = sc.nextDouble();
			media = (teste1*2.0 + teste2*3.0 + teste3*5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}

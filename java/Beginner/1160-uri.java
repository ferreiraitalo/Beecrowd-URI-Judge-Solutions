import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int T = sc.nextInt();
		
		for (int i=1; i<=T; i++) {
			int PA = sc.nextInt();
			int PB = sc.nextInt();
			double G1 = sc.nextDouble();
			double G2 = sc.nextDouble();
			
			int anos = 0;
			while (PA <= PB && anos <=100) {
				PA = (int) (PA * (G1/100.0) + PA);
				PB = (int) (PB * (G2/100.0) + PB);
				anos += 1;
			}
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			}
			else {
				System.out.println(anos + " anos.");
			}
		}
		
		sc.close();
	}

}

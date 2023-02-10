import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int coelho = 0, rato = 0, sapo = 0;
				
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int quantidade = sc.nextInt();
			char cobaia = sc.next().charAt(0);
			
			if (cobaia == 'C') {
				coelho = coelho + quantidade;
			}
			else if (cobaia == 'R') {
				rato = rato + quantidade;
			}
			else {
				sapo = sapo + quantidade;
			}
		}
		int totalCobaias = coelho + rato + sapo;
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		
		double percCoelho = (double) (coelho * 100.00) / totalCobaias;
		double percRato = (double) (rato * 100.00) / totalCobaias;
		double percSapo = (double) (sapo * 100.00) / totalCobaias;
		
		System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", percRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", percSapo);
		
		sc.close();
	}

}

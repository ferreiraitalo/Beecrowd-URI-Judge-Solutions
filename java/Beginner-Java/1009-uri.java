import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salfixo, salcomissao, total;
		
		sc.next();
		salfixo = sc.nextDouble();
		salcomissao = sc.nextDouble();
		
		total = salcomissao * 0.15 + salfixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}

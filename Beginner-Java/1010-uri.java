import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double v1, v2, vtotal;
		
		sc.nextInt(); num1 = sc.nextInt(); v1 = sc.nextDouble();
		sc.nextInt(); num2 = sc.nextInt(); v2 = sc.nextDouble();
		
		vtotal = num1*v1+num2*v2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vtotal);
				
		sc.close();
		
	}

}

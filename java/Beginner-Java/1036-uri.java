import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, Delta, R1, R2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Delta = Math.pow(B, 2.0) - 4.0*A*C;
		
		if (Delta < 0.0 || A == 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			R1 = (-B + Math.sqrt(Delta)) / (2.0 * A);
			R2 = (-B - Math.sqrt(Delta)) / (2.0 * A);
			
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
			}
		
		sc.close();
	}
}

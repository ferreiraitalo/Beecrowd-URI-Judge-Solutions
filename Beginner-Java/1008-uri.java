import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int X, Y;
		double Z, sal;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextDouble();
		
		sal = Y*Z;
		
		System.out.println("NUMBER = " + X);
		System.out.printf("SALARY = U$ %.2f%n", sal);
				
		sc.close();

	}

}

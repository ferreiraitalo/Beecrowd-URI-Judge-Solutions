import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		float a, b ,c, perimetro, area;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if (a + b > c && a + c > b && b + c > a) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else {
			area = ((a + b) * c) / 2f;
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double x, y, media;
		int nvCalculo = 1;
		
		while (nvCalculo == 1) {
			x = sc.nextDouble();
			while (x < 0.0 || x > 10.0) {
				System.out.println("nota invalida");
				x = sc.nextDouble();
			}
			y = sc.nextDouble();
			while (y < 0.0 || y > 10.0) {
				System.out.println("nota invalida");
				y = sc.nextDouble();
			}
			
			media = (x + y) / 2.0;
			System.out.printf("media = %.2f%n", media);
			
			System.out.println("novo calculo (1-sim 2-nao)");
			nvCalculo = sc.nextInt();
			while (nvCalculo != 1 && nvCalculo != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				nvCalculo = sc.nextInt();				
			}
			
		}		
		
		sc.close();		

	}

}

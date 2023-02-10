import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x, alcool = 0, gasolina = 0, diesel = 0;
		
		x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alcool = alcool + 1;
			}
			else if (x == 2) {
				gasolina = gasolina + 1;
			}
			else if (x == 3) {
				diesel = diesel + 1;
			}
			x = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);	
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}

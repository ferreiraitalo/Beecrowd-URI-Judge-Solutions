import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double valor; 
		int nota, quociente, moeda, resto;
		
		valor = sc.nextDouble();
		resto = (int) (valor * 100.0 + 0.5);
		 	
		System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		nota = 20;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		nota = 10;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		nota = 5;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		nota = 2;
		quociente = resto / (nota * 100);
		System.out.printf("%d nota(s) de R$ %d.00%n", quociente, nota);
		resto = resto % (nota * 100);
		
		System.out.println("MOEDAS:");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 1.00%n", quociente);
		resto = resto % moeda;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 0.50%n", quociente);
		resto = resto % moeda;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 0.25%n", quociente);
		resto = resto % moeda;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 0.10%n", quociente);
		resto = resto % moeda;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 0.05%n", quociente);
		resto = resto % moeda;
		
		moeda = 1;
		quociente = resto / moeda;
		System.out.printf("%d moeda(s) de R$ 0.01%n", quociente);
		resto = resto % moeda;
		
		sc.close();
	}

}

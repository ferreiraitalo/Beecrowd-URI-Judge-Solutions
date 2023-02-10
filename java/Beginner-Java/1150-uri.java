import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int X = sc.nextInt();
		int Z = sc.nextInt();
		
		while (Z<=X) {
			Z = sc.nextInt();
		}
		
		int soma = 0, cont = 1;
		for (int i=X; soma<=Z; i++) {
			soma = soma + i;
			
			if (soma < Z) {
				cont++;
				}
		}
		
		System.out.println(cont);
		
		sc.close();
	}

}

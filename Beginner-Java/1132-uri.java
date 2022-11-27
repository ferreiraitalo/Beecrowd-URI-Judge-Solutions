import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int soma = 0, n1, n2;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x < y) {
			n1 = x;
			n2 = y;
		}
		else {
			n1 = y;
			n2 = x;
		}
		
		for (int i=n1; i<=n2; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
			
		sc.close();

	}

}

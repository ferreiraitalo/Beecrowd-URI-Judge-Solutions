import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int x = sc.nextInt();
			
			int soma = 0;
			for  (int j=1; j<x; j++) {
				
				if (x%j==0) {
					soma += j;
				}
			}
				
			if (soma == x) {
				System.out.println(x + " eh perfeito");
			}
			else {
				System.out.println(x + " nao eh perfeito");
			}		
		}
			
		sc.close();
	}

}

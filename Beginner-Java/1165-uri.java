import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int quantidade;
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int x = sc.nextInt();
			
				quantidade = 0;
				for (int j=2; j<x; j++) {
					
					if (x % j == 0) {
						quantidade++;
					}
				}
		if (quantidade == 0) {
			System.out.println(x + " eh primo");
		}
		else {
			System.out.println(x + " nao eh primo");
		}
		
		}
		
		sc.close();
	}

}

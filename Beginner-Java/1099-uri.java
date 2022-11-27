import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int menor, maior;
		
		int N = sc.nextInt();
			
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
				if (x < y) {
					menor = x;
					maior = y;
				}
				else {
					menor = y;
					maior = x;
				}
					int soma = 0, soma1 = 0;
					for (int j=menor+1; j<maior; j++) {
						
						if (j % 2 != 0) {
							soma += j;
						}
						else {
							soma1 = 0;
						}
					}
					System.out.println(soma+soma1);
		}
		sc.close();

	}

}

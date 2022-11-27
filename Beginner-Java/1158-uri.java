import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			int soma = 0;
			int cont = 0;
			for (int i1=x; cont<y; i1++) {
				if (i1 % 2 != 0) {
					soma = soma + i1;
					cont = cont + 1;
				}
			}
			System.out.println(soma);
		}

		sc.close();
	}
}


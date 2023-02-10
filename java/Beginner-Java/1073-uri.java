import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int quadrado;
			if (i % 2 == 0) {
				quadrado = i * i;
				System.out.println(i + "^2 = " + quadrado);
			}
		}
		sc.close();
	}

}

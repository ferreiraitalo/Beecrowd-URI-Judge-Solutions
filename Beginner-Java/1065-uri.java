import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int quantidade = 0;
		
		for (int i=0; i<5; i++) {
			int n = sc.nextInt();
			
			if (n % 2 == 0) {
				quantidade++;
			}
		}
		
		System.out.println(quantidade + " valores pares");
		
		sc.close();
	}

}

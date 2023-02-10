import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int C = sc.nextInt();
		
		for (int i=0; i<C; i++) {
			String palavra = sc.next();
			double T = 0.01 * palavra.length();
			System.out.printf("%.2f%n", T);
		}
		
		sc.close();

	}

}

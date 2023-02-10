import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		for (int i=n; cont<6; i++) {
			
			if (i % 2 != 0) {
				cont++;
				System.out.println(i);
			}
		}	
		
		sc.close();
	}
}

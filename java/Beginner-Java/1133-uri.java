import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor = 0, maior = 0;
		if (x<y) {
			menor = x;
			maior = y;
		}
		else {
			maior = x;
			menor = y;
		}
		
		for (int i=menor+1; i<maior; i++) {
			
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}			
		}
		
		sc.close();

	}
}

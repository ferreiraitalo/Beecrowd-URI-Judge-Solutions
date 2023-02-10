import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int menor, maior;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x>0 && y>0) {
				if (x<y) {
				menor = x;
				maior = y;
				}
				else {
					maior = x;
					menor = y;
				}
				
				int soma = 0;
				for (int i=menor; i<=maior; i++) {
					soma = soma + i;
					System.out.print(i + " ");
				}
				System.out.println("Sum=" + soma);
				
				x = sc.nextInt();
				y = sc.nextInt();
			}
		
		sc.close();

	}
}

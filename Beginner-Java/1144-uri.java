import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int x; 
		int y = 1; 
		int z = 1;
				
		for (int i=1; i<=N; i++) {
			x = i;
			y = x * x;
			z = y * i;
			System.out.printf("%d %d %d%n", x, y, z);
			
			int num1 = x;
			int num2 = y + 1;
			int num3 = z + 1;
			System.out.printf("%d %d %d%n", num1,num2, num3);
		}
		
		sc.close();

	}

}

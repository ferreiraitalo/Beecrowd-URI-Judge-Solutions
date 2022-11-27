import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int X = i*1;
			int Y = X*i;
			int Z = Y*i;
			System.out.printf("%d %d %d%n", X, Y, Z);
			
		}
		
		sc.close();
		
	}
	
}
		
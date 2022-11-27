import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int primeiro = 1;
		
		for (int i=1; i<=n; i++) {
			int segundo = primeiro + 1;
			int terceiro = primeiro + 2;
			System.out.printf("%d %d %d PUM%n", primeiro, segundo, terceiro);
			
			primeiro = primeiro + 4;
			}
				
		sc.close();
	}

}

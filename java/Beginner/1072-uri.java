import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int in = 0, out = 0;
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");		
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		int N = sc.nextInt();
		
		int calculo = N;
		
		for (int i=1; i<N; i++) {
			 calculo = calculo * (N-i);
		}
		System.out.println(calculo);

		sc.close();
	}

}

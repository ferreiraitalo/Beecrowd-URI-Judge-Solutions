import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, maior;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		D = (A+B+Math.abs(A-B))/2;
		maior = (C+D+Math.abs(C-D))/2;
		
		System.out.println(maior + " eh o maior");
		
		sc.close();
	}

}

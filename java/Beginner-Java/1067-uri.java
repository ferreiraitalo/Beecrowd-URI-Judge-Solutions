import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			x = x - 1;
		}
		for (int i=1; i<=x; i=i+2) {
			System.out.println(i);
		}
		
		sc.close();

	}

}

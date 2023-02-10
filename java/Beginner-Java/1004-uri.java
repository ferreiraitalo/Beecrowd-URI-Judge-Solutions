import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y, prod;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		prod = X * Y;
		
		System.out.println("PROD = " + prod);
				
		sc.close();
	}

}

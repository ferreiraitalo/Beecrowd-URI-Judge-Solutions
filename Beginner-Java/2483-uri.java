import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		String a = "a";
		for (int i=1; i<x; i++) {
			a += "a";
		}
		
		System.out.printf("Feliz nat%sl!%n", a);
		
		sc.close();
	}

}

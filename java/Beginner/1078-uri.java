import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x, tabuada;
		
		x = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			tabuada = x * i;
			System.out.println(i + " x " + x + " = " + tabuada);
		}
			
		sc.close();

	}

}

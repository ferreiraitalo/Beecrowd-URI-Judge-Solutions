import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int nota = sc.nextInt();
		
		char letra;
		if (nota==0) {
			letra = 'E';
		}
		else if (nota<=35) {
			letra = 'D';
		}
		else if (nota<=60) {
			letra = 'C';
		}
		else if (nota<=85) {
			letra = 'B';
		}
		else {
			letra = 'A';
		}
		
		System.out.println(letra);
		
		sc.close();
	}

}

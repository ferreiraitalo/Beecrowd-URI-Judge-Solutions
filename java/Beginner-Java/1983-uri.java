import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		double notaMaior = 0;
		int matriculaMaior = 0;		
		for (int i=0; i<N; i++) {
			int matricula = sc.nextInt();
			double nota = sc.nextDouble();
			
			if (nota>notaMaior && nota>=8.0) {
				notaMaior = nota;
				matriculaMaior = matricula;
			}
		}
		if (notaMaior<8.0) {
			System.out.println("Minimum note not reached");
		}
		else {
			System.out.println(matriculaMaior);
		}
		
		sc.close();
	
	}

}

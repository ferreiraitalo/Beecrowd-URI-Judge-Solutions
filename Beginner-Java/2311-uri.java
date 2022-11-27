import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		List<Double> nota = new ArrayList<>();
		for (int i=0; i<N; i++) {
			String nome = sc.next();
			double grauDificuldade = sc.nextDouble();
			
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			nota.add(sc.nextDouble());
			Collections.sort(nota);
			nota.remove(0); 
			nota.remove(5);
			
			double somaNota = 0;
			for (Double valor:nota)
				somaNota+=valor;
				System.out.printf("%s %.2f\n",nome,somaNota*grauDificuldade);
				nota = new ArrayList<>();
		}
				
		sc.close();
	}
}

			 
			
			


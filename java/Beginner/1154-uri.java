import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int x, somaIdade = 0, mediaIdade = 0;
		double media;
		
		x = sc.nextInt();
		
		while (x >= 0) {
			somaIdade = somaIdade + x;
			mediaIdade = mediaIdade + 1;
			x = sc.nextInt();
		}
		
		media = (double) somaIdade / mediaIdade;
		
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}

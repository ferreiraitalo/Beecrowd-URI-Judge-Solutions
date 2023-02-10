import java.io.IOException;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws IOException {
		try (Scanner leitor = new Scanner (System.in)) {
			
			while (leitor.hasNext()) {
				int N = leitor.nextInt();
				
				if (N == 0) {
					System.out.println("vai ter copa!");
				}
				else {
					System.out.println("vai ter duas!");
				}
			}
		}
		
	}
}


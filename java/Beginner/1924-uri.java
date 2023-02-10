import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(sc.readLine());
		
		for (int i=0; i<N; i++) {
			sc.readLine();
		}
		
		System.out.println("Ciencia da Computacao");
		
		sc.close();
	}
}

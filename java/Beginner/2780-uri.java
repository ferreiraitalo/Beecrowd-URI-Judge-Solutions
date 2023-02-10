import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int distancia = sc.nextInt();
		
		int pontos;
		if (distancia <= 800) {
			pontos = 1;
		}
		else if (distancia > 800 && distancia <=1400) {
			pontos = 2;
		}
		else {
			pontos = 3;
		}
		
		System.out.println(pontos);
		
		sc.close();

	}

}

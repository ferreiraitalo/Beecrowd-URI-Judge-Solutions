import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio > fim) {
			duracao = (24 - inicio) + fim;
		}
		else if (fim > inicio) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

}

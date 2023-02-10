import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int parEimpar = sc.nextInt();
		int escolha1 = sc.nextInt();
		int escolha2 = sc.nextInt();
		int roubo = sc.nextInt();
		int acusou = sc.nextInt();
		
		int soma = escolha1 + escolha2;
		
		if (roubo == 1 && acusou == 1) {
			System.out.println("Jogador 2 ganha!");
		}
		else if (roubo == 1 && acusou == 0) {
			System.out.println("Jogador 1 ganha!");
		}
		else if (roubo == 0 && acusou == 1) {
			System.out.println("Jogador 1 ganha!");
		}
		else {
			if (parEimpar == 1 && soma % 2 == 0) {
				System.out.println("Jogador 1 ganha!");
			}
			else if (parEimpar == 0 && soma % 2 != 0) {
				System.out.println("Jogador 1 ganha!");
			}
			else {
				System.out.println("Jogador 2 ganha!");
			}			
		}
		
		sc.close();
	}

}

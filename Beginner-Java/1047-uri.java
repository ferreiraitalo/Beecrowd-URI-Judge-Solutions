import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hrInicial, minInicial, hrFinal, minFinal, instanteInicial, instanteFinal, duracao = 0, duracaoHoras, duracaoMinutos;
		
		hrInicial = sc.nextInt();
		minInicial = sc.nextInt();
		hrFinal = sc.nextInt();
		minFinal = sc.nextInt();
		
		instanteInicial = hrInicial * 60 + minInicial;
		instanteFinal = hrFinal * 60 + minFinal;
		
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		}
		else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		
		duracaoHoras = duracao / 60;
		duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();
	}
}
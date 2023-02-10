import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int horaSaida = sc.nextInt();
		int tempoGasto = sc.nextInt();
		int fuso = sc.nextInt();
		
		if (horaSaida == 0) {
			horaSaida = 24;
		}
		
		int horaAtual;
		if (horaSaida + tempoGasto > 24) {
			horaAtual = (tempoGasto+fuso) - (24-horaSaida);
		}
		else {
			horaAtual = horaSaida+tempoGasto+fuso;
		}
		
		if (horaAtual == 24) {
			horaAtual = 0;
		}
		else if (horaAtual < 0) {
			horaAtual = 24 + horaAtual;
		}
		
		System.out.println(horaAtual);
		
		sc.close();
	}

}

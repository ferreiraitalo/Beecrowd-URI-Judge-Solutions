import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, horas, minutos, segundos, resto;
		
		x = sc.nextInt();
		
		horas = x / 3600;
		resto = x % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}

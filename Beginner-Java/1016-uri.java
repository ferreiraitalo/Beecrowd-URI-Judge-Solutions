import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km, tempo;
		
		km = sc.nextInt();
		
		tempo = km * 2;
		
		System.out.println(tempo + " minutos");		

		sc.close();
	}

}

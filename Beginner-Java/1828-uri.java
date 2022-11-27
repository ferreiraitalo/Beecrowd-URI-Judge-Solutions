import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int T = sc.nextInt();
		
		int vencedor;
		for (int i=1; i<=T; i++) {
			String sheldon = sc.next();
			String raj = sc.next();
			
			if (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) {
				vencedor = 1;
			}
			else if (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) {
				vencedor = 1;
			}
			else if (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) {
				vencedor = 1;
			}
			else if (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) {
				vencedor = 1;
			}
			else if (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))) {
				vencedor = 1;
			}
			else if(sheldon.equals(raj)) {
				vencedor = 0;
			}
			else {
				vencedor = 2;
			}
			
			if (vencedor==1) {
				System.out.println("Caso #" + i + ": Bazinga!");
			}
			else if (vencedor==2) {
				System.out.println("Caso #" + i + ": Raj trapaceou!");
			}
			else {
				System.out.println("Caso #" + i + ": De novo!");
			}
		}
	
		sc.close();
	}

}

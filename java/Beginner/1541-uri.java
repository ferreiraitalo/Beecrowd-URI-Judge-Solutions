import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int lado1, lado2;
		double percentualLiberado;
		
		while ((lado1 = sc.nextInt()) !=0) {
		lado2 = sc.nextInt();
		percentualLiberado = sc.nextInt();
		
		int tamanhoCasa = lado1 * lado2;
		int tamanhoTerreno = (int) ((double) tamanhoCasa / (percentualLiberado/100));
		int ladoTerreno = (int) Math.sqrt(tamanhoTerreno);
		System.out.println(ladoTerreno);
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int frangoDisponivel = sc.nextInt();
		int bifeDisponivel = sc.nextInt();
		int massaDisponivel = sc.nextInt();
		
		int frangoPedido = sc.nextInt();
		int bifePedido = sc.nextInt();
		int massaPedido = sc.nextInt();
		
		int semFrango = 0, semBife = 0, semMassa = 0; 
		if (frangoPedido>frangoDisponivel) {
			semFrango = frangoPedido - frangoDisponivel;
		}
		if (bifePedido>bifeDisponivel) {
			semBife = bifePedido - bifeDisponivel;
		}
		if (massaPedido>massaDisponivel) {
			semMassa = massaPedido - massaDisponivel;
		}
		
		int totalSem = semFrango + semBife + semMassa;
		
		System.out.println(totalSem);		
		
		sc.close();

	}

}

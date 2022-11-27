import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int M = sc.nextInt();
		
				for (int i=0; i<M; i++) {
					int Xi = sc.nextInt();
					int Yi = sc.nextInt();
								
					if ((Xi <= X && Yi <= Y) || (Xi <= Y && Yi <= X) || (Yi <= X && Xi <= Y)) {
						System.out.println("Sim");
					}
					else {
						System.out.println("Nao");
					}
						
				}
		}
		sc.close();
	}

}

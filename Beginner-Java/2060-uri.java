import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		
		int quantidade2=0, quantidade3=0, quantidade4=0, quantidade5=0;
		for (int i=1; i<=N; i++) {
			int x = sc.nextInt();
			
			if (x % 2 == 0) {
				quantidade2+=1;
			}
			if (x % 3 == 0) {
				quantidade3+=1;
			}
			if (x % 4 == 0) {
				quantidade4+=1;
			}
			if (x % 5 == 0) {
				quantidade5+=1;
			}
		}
		System.out.println(quantidade2 + " Multiplo(s) de 2");
		System.out.println(quantidade3 + " Multiplo(s) de 3");
		System.out.println(quantidade4 + " Multiplo(s) de 4");
		System.out.println(quantidade5 + " Multiplo(s) de 5");
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		System.out.println("A = " + a +", B = " + b +", C = " + c);
		System.out.println("A = " + b +", B = " + c +", C = " + a);
		System.out.println("A = " + c +", B = " + a +", C = " + b);
		
		sc.close();
	}

}

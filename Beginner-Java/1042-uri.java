import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 0, y = 0, z = 0, n1, n2, n3;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 < n2 && n1 < n3) {
				 x = n1;
				if (n2 < n3) {
					y = n2;
					z = n3;
				}
				else {
					z = n2;
					y = n3;
				}
		}
		else if (n2 < n3) {
			x = n2;
			if (n1 < n3) {
				y = n1;
				z = n3;
			}
			else {
				y = n3;
				z = n1;
			}
		}
		else {
			x = n3;
			if (n1 < n2) {
				y = n1;
				z = n2;
			}
			else {
				y = n2;
				z = n1;
			}
		}
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z); 
		System.out.println("");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		sc.close();
	}

}

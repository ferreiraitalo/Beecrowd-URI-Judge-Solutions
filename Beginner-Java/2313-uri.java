import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int hipotenusa, cateto1, cateto2;
		if (a>b && a>c) {
			hipotenusa = a;
			cateto1 = b;
			cateto2 = c;
		}
		else if (b>a && b>c) {
			hipotenusa = b;
			cateto1 = a;
			cateto2 = c;
		}
		else {
			hipotenusa = c;
			cateto1 = a;
			cateto2 = b;
		}
		
		if (a+b>c && a+c>b && b+c>a) {
			if (a==b && b==c) {
				System.out.println("Valido-Equilatero");
			}
			else if (a!=b && b!=c && c!=a) {
				System.out.println("Valido-Escaleno");
			}
			else {
				System.out.println("Valido-Isoceles");
			}
				if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
				System.out.println("Retangulo: S");
				}
				else {
				System.out.println("Retangulo: N");
				}
		}
		else {
			System.out.println("Invalido");
		}
		
		sc.close();
	}

}

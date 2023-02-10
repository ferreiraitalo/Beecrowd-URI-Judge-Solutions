import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, reajuste = 0, nvsalario = 0;
		int percentual = 0;
		
		salario = sc.nextDouble();
		
		if (salario <= 400.00) {
			percentual = 15;
			reajuste = salario * percentual/100;
			nvsalario = salario + reajuste;
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			percentual = 12;
			reajuste = salario * percentual/100;
			nvsalario = salario + reajuste;
		}
		else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
			reajuste = salario * percentual/100;
			nvsalario = salario + reajuste;
		}
		else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
			reajuste = salario * percentual/100;
			nvsalario = salario + reajuste;
		}
		else if (salario >= 2000.01) {
			percentual = 4;
			reajuste = salario * percentual/100;
			nvsalario = salario + reajuste;
		}
		
		System.out.printf("Novo salario: %.2f%n", nvsalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
				
		sc.close();
	}

}

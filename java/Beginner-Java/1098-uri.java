import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double I = 0;
		while (I<=2) {
			
			for (int j=1; j<=3; j++) {
				double J = j + I;
				
				if (I == 0 || I == 1 || I >= 1.9) {
					System.out.println("I=" + Math.round(I) + " J=" + Math.round(J));
				}
				else {
					System.out.printf("I=%.1f J=%.1f%n", I, J);
				}
			}
			I += 0.2;
		}
		
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x;
		String mes = null;
		
		x = sc.nextInt();
		
		if (x == 1) {
			mes = "January";
		}
		if (x == 2) {
			mes = "February";
		}
		if (x == 3) {
			mes = "March";
		}
		if (x == 4) {
			mes = "April";
		}
		if (x == 5) {
			mes = "May";
		}
		if (x == 6) {
			mes = "June";
		}
		if (x == 7) {
			mes = "July";
		}
		if (x == 8) {
			mes = "August";
		}
		if (x == 9) {
			mes = "September";
		}
		if (x == 10) {
			mes = "October";
		}
		if (x == 11) {
			mes = "November";
		}
		if (x == 12) {
			mes = "December";
		}
		
		System.out.println(mes);		
		
		sc.close();
	}

}

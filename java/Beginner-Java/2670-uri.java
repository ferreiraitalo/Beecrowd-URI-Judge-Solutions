import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		
		 int minutos = 0;
	     if ((A2 >= A3 && A2 >= A1))
	    	 minutos = (A3 + A1) * 2;
	     else if (A3 >= A1 && (A1 + A2) <= A3)
	    	 minutos = (A1 * 4) + (A2 * 2);
	     else if (A1 >= A3 && (A3 + A2) <= A1)
	    	 minutos = (A3 * 4) + (A2 * 2);
	     else 
	    	 minutos = (A3 + A1) * 2;
	     System.out.println(minutos);
	        
	     sc.close();
	    }
		
	}
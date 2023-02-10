import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String data = sc.next();
		String DD = data.split("/")[0];
		String MM = data.split("/")[1];
		String AA = data.split("/")[2];
		
		System.out.println(MM + "/" + DD + "/" +AA);
		System.out.println(AA + "/" + MM + "/" +DD);
		System.out.println(DD + "-" + MM + "-" +AA);
		
		sc.close();
	}

}

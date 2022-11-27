import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int resto, datainicio, datafim, hhi, mmi, ssi, hhf, mmf, ssf, segundosinicio, segundosfinal, segundosoutros, segundostotal, dia, hora, minuto, segundo;
		
	    sc.next(); datainicio = sc.nextInt();
		hhi = sc.nextInt(); sc.next(); mmi = sc.nextInt(); sc.next(); ssi = sc.nextInt();
		sc.next(); datafim = sc.nextInt();
		hhf = sc.nextInt(); sc.next(); mmf = sc.nextInt(); sc.next(); ssf = sc.nextInt();
		
		segundosinicio = 86400 - (hhi*3600 + mmi*60 + ssi);
		segundosfinal = hhf*3600 + mmf*60 + ssf;
		segundosoutros = (datafim - datainicio - 1) * 86400;
		segundostotal = segundosinicio+segundosfinal+segundosoutros;
		
		dia = segundostotal / 86400;
		resto = segundostotal % 86400;
		hora = resto / 3600;
		resto = resto % 3600;
		minuto = resto / 60;
		resto = resto % 60;
		segundo = resto;
		
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");		

		sc.close();
	}

}

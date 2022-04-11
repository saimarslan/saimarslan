package ilkproje;
import java.util.Scanner;
public class Yılsonufaiz {
public static void main (String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	int anapara , vade;
	
	System.out.println("Bankamıza hoşgeldiniz, yıllık faiz oranımız %6 olarak belirlenmiştir.");
	
	System.out.println("Ana para miktarını giriniz: ");
	anapara = scanner.nextInt();
	System.out.println("Vade süresini giriniz:  ");
	vade = scanner.nextInt();
	
	int toplampara = anapara;
	double faizoranı = 0.06;
	
	for(int i=1 ; i<=vade ; i++) {
		
		toplampara = (int) ((toplampara * faizoranı) + toplampara) ;
		
		System.out.println(i + ".yıl sonu rakamı " + toplampara + "TL");
	}
}
}

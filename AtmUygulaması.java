package ilkproje;
import java.util.Scanner;
public class AtmUygulaması {
public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("***********************");
	System.out.println("1.İşlem - Bakiyenizi sorgulayın..\n" +
					   "2.İşlem - Para çekme işlemi..\n" +
					   "3.İşlem - Para yatırma işlemi...\n" +
					   "4.İşlem - Çıkış için q'ya basınız...");
	System.out.println("***********************");
	
	
	
			
	int bakiye = 1750;
	
	while (true) {

		System.out.println("Yapmak istediğiniz işlemi tuşlayınız...");
		String işlem = scanner.nextLine();
		
		if(işlem.equals("1")) {
			System.out.println("Bakiyeniz : " + bakiye + "TL");
		}
		else if (işlem.equals("2")) {
			System.out.println("Çekmek istediğiniz tutarı giriniz..");
			int paracek = scanner.nextInt();
			scanner.nextLine();
			if (paracek > bakiye) {
				System.out.println("Bakiyeniz yetersiz, işlemi tekrarlayınız..");
				continue;
			}
			bakiye -= paracek;
			System.out.println("Yeni Bakiyeniz:" + bakiye + "TL");
		
		} else if (işlem.equals("3")) {
			System.out.println("Yatırmak istediğiniz miktarı giriniz...");
			int parayatir = scanner.nextInt();
			scanner.nextLine();
			
			bakiye += parayatir;
			System.out.println("Yeni Bakiyeniz" + bakiye + "TL");
		}else if (işlem.equals("q")) {
			System.out.println("İşlemi sonlandırdınız... İyi günler dileriz...");
			break;
		}else {
			System.out.println("Geçersiz İşlem.. Lütfen 1-3 arası bir rakam tuşlayınız.");
		}
		
		
	}
			
		 
					 
}
}

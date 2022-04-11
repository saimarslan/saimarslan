package ilkproje;
import java.util.Scanner;
public class Gelismishesap {

	public static int toplama(int a, int b) {
		
		return (a+b);
	}
public static int toplama(int a, int b,int c) {
		
		return (a+b+c);
	}
public static int cikarma (int a, int b) {
	
	return (a-b);
}
public static int cikarma (int a, int b, int c) {
	
	return (a-b-c);
}
public static int carpma (int a, int b) {
	
	return(a*b);
}
public static int carpma (int a, int b,int c) {
	
	return(a*b*c);
}
public static double bolme (int a, int b) {
	
	return (a/b);
}
	
public static void main (String[]args) {
Scanner scanner = new Scanner(System.in);
	String islemler = "1.İşlem toplama \n" + 
					"2.İşlem çıkartma \n" +
					"3.işlem çarpma \n" +
					"4.İşlem bölme \n" +
					"5.Çıkış için q tuşuna basınız " ;
	
	System.out.println("**************************");
	System.out.println(islemler);
	System.out.println("**************************");	
	
	while(true) {
		
	System.out.println("Yapmak istediğiniz işlemi seçiniz...");
	String islem = scanner.nextLine();
	if(islem.equals("1")) {
		System.out.println("2 sayı mı 3 sayı mı toplayacağız");
		String sayi = scanner.nextLine();
		if(sayi.equals("2")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("2 sayınının toplamı: " + toplama(a,b));
			scanner.nextLine();
		} else if (sayi.equals("3")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("3.sayiyi giriniz..");
			int c = scanner.nextInt();
			System.out.println("2 sayınının toplamı: " + toplama(a,b,c));
			scanner.nextLine();	
		}else {
			System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
		}
	}
	else if(islem.equals("2")) {
		System.out.println("2 sayı mı 3 sayı mı farkını alacagız");
		String sayi = scanner.nextLine();
		if(sayi.equals("2")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("2 sayınının farkı: " + cikarma(a,b));
			scanner.nextLine();
		} else if (sayi.equals("3")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("3.sayiyi giriniz..");
			int c = scanner.nextInt();
			System.out.println("3 sayınının farkı: " + cikarma(a,b,c));
			scanner.nextLine();	
		}else {
			System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
		}
		
		
	}	
	else if(islem.equals("3")) {
		System.out.println("2 sayı mı 3 sayı mı carpacagız");
		String sayi = scanner.nextLine();
		if(sayi.equals("2")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("2 sayınının carpimi: " + carpma(a,b));
			scanner.nextLine();
		} else if (sayi.equals("3")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("3.sayiyi giriniz..");
			int c = scanner.nextInt();
			System.out.println("3 sayınının carpimi: " + carpma(a,b,c));
			scanner.nextLine();	
		}else {
			System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
		}
		
		
	}
	else if(islem.equals("3")) {
		System.out.println("2 sayı mı 3 sayı mı carpacagız");
		String sayi = scanner.nextLine();
		if(sayi.equals("2")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("2 sayınının carpimi: " + carpma(a,b));
			scanner.nextLine();
		} else if (sayi.equals("3")) {
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			System.out.println("3.sayiyi giriniz..");
			int c = scanner.nextInt();
			System.out.println("3 sayınının carpimi: " + carpma(a,b,c));
			scanner.nextLine();	
		}else {
			System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
		}
		
		
	}else if(islem.equals("q")) {
		System.out.println("İşlemi sonlandırdınız......");
		break;
	}
	else if(islem.equals("4")) {
	
		System.out.println("Bölme işlemi yapılacak 2 sayı giriniz..");
			System.out.println("1.sayiyi giriniz..");
			int a = scanner.nextInt();
			System.out.println("2.sayiyi giriniz..");
			int b = scanner.nextInt();
			if(a > b) {
				
		
			System.out.println("2 sayınının bölümü: " + bolme(a,b));
			scanner.nextLine();
			}else {
				System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
				scanner.nextLine();
			}
			
			
			
		}else {
			System.out.println("Yanlış kodlama yaptınız, lütfen tekrar tuşlayın..");
		}
		
		
	}
		
	}		
		
}		
		
	
		


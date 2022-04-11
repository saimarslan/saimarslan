
public class Calisan {

	private String isim;
	private int maas;
	private String departman;
	
	
	public Calisan(String isim, int maas, String departman) {
		
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void Calis() {
		
		System.out.println("Çalışan çalışıyor...");
	}
	
	public void bilgiler() {
		System.out.println("Çalışanın ismi : " + isim);
		System.out.println("Çalışanın maaşı : " + maas);
		System.out.println("Çalışanın departmanı : " + departman);
	}
	public void departman_degisimi(String yeni_departman) {
		
		this.departman = yeni_departman;
		System.out.println("Çalışanın yeni departmanı : " + yeni_departman);
	}
}

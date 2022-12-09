package Vize;
import java.util.Scanner;
//Ürünün KDV'li fiyatını hesaplama
public class KdvHesaplama {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("Urunun KDV degeri olmayan fiyatini giriniz");
				double Fiyat=giris.nextDouble();
				double KdvFiyat= Fiyat+ (Fiyat*0.18);
			System.out.println("Urunun KDV'li fiyati :"+ KdvFiyat);
	}
}

package Vize;

import java.util.Scanner;
//Kullanıcıdan alınan kilo ve boy bilgilerine göre Boy Kilo İndeksi hesaplaması yapınız
public class BoyKilo {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("Boyunuzu giriniz ornegin (1,80)");
				Double Boy =giris.nextDouble();
			System.out.println("Kilonuzu giriniz ornegin (80)");
				double Kilo=giris.nextDouble();
				Double Bki=Kilo/(Boy*Boy);
			System.out.println("Boy Kilo indeksiniz: " + Bki);
		if(Bki<25)
			System.out.println("Normal");
		else if(Bki<30)
			System.out.println("Kilolu");
		else if(Bki<35)
			System.out.println("Obez");
		else if(Bki<40)
			System.out.println("İleri Obez");
	}
}

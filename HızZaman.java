package Vize;

import java.util.Scanner;
//Yolu istenilen saate gitmek için gereken hızı hesaplama
public class HızZaman {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Gitmek istediginiz yolu Km olarak giriniz");
			int yol=giris.nextInt();
		System.out.println("Ne Kadar saate gitmek istediginizi giriniz");
			int saat=giris.nextInt();
		System.out.println("Gitmeniz gereken hiz: " + (yol/saat)+" km/s");
	}
}

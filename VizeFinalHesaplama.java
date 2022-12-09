package Vize;

import java.util.Scanner;
//Vize ve final ile not hesaplama
public class VizeFinalHesaplama {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("Ogrencinin vize notunu giriniz:");
				double vize=giris.nextDouble();
			System.out.println("Ogrencinin final notunu giriniz:");
				double fınal=giris.nextDouble();
				double not=(vize*40/100)+(fınal*60/100);
			if(not<50)
				System.out.println("Notunuz:"+ not +" Basarisiz");
			else
				System.out.println("Notuuz:"+ not +" Basarili");	
	}
}

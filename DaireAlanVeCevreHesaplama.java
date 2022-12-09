package Vize;

import java.util.Scanner;
// Kullanıcıdan alınan yaricap bilgisi ile dairenin çevresi ve alanını hesaplama
public class DaireAlanVeCevreHesaplama {
		
	public static void main(String[] args) {
		final double PI = 3.14159;
		System.out.println("Bir yaricap degeri giriniz");
			Scanner giris = new Scanner (System.in);
			double yaricap= giris.nextDouble(); 
			double alan = yaricap*yaricap*PI;
			double cevre=PI*yaricap*2;
		System.out.println("Girdiginiz yaricapa sahip dairenin alani:" + alan);
		System.out.println("Girdiginiz yaricapa sahip dairenin cevresi:" + cevre);
	}
	
}

package Vize;

import java.util.Scanner;
//Sayinin tek mi çift mi oldugunu bulma
public class TekCift {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("Bir  tam sayi giriniz:");
				int sayi=giris.nextInt();
			if(sayi %2==0)
				System.out.println("Sayi cift sayidir.");
			else
				System.out.println("Sayi tek sayidir.");
			
	}
}

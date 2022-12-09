package Vize;

import java.util.Scanner;
//2 tam sayi arasında 4 İşlemi yapan basit bir hesap makinesi
public class BasitHesapMakine {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("Toplama islemi icin 1");
			System.out.println("Cikarma islemi icin 2");
			System.out.println("Carpma islemi icin 3");
			System.out.println("Bolme islemi icin 4");
				int secim=giris.nextInt();
			System.out.println("Birinci tam sayiyi giriniz:");
				float sayi1=giris.nextFloat();
			System.out.println("Ikinci tam sayiyi giriniz:");
				float sayi2=giris.nextFloat();
			if(secim==1)
				System.out.println("Toplama isleminin sonucu:" + (sayi1+sayi2));
			else if(secim==2)
				System.out.println("Cikarma isleminin sonucu:" + (sayi1-sayi2));
			else if(secim==3)
				System.out.println("Carpma isleminin sonucu:" + (sayi1*sayi2));
			else if (secim==4)
				System.out.println("Bolme isleminin sonucu:" + (sayi1/sayi2));
	}
}

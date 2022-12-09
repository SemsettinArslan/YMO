package Vize;

	import java.util.Scanner;
	//Tas Kagit Makas
public class TasKagitMakas {
	public static void main(String[] args) {
				
		
		Scanner giris = new Scanner (System.in);
		System.out.println("1 Tas 2 Kagit 3 Makas");
		System.out.print("1,2,3 Rakamlarindan birini seciniz");
		
		int secim = giris.nextInt();
		int a =(int)(1+Math.random()*3);
		if(secim !=1 && secim !=2 && secim!=3)
			System.out.println("Yanlis giris");
		
		if(secim==a)
			System.out.println("Berabere");
		else if(secim==1 && a==2)
			System.out.println("Tası sectiniz, Bilgisayar kagit secti Bilgisayar kazandi");
		else if(secim==1 && a==3)
			System.out.println("Tası sectiniz, Bilgisayar makas secti Sen kazandin");
		else if(secim==2 && a==1)
			System.out.println("Kagit sectiniz, Bilgisayar tas secti Sen kazandin");
		else if(secim==2 && a==3)
			System.out.println("Kagit sectiniz, Bilgisayar makas secti Bilgisayar Kazandi");
		else if(secim==3 && a==1)
			System.out.println("Makas sectiniz Bilgisayar tas secti Bilgisayar kazandi");
		else if(secim==3 && a==2)
			System.out.println("Makas sectiniz bilgisayar kagit secti Sen Kazandin");
	}
}

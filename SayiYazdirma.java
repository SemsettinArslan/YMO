package Vize;

import java.util.Scanner;
//Girilen sayıyı yazıyla yazma
public class SayiYazdirma {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("2 Basamakli bir tam sayi giriniz:");
				int sayi=giris.nextInt();	
				int birler= sayi%10;
				int onlar=sayi/10;
		switch(onlar) {
		case 1:
			System.out.print("On");
			break;
		case 2:
			System.out.print("Yirmi");
			break;
		case 3:
			System.out.print("Otuz");
			break;
		case 4:
			System.out.print("Kirk");
			break;
		case 5:
			System.out.print("Elli");
			break;
		case 6:
			System.out.print("Altmis");
			break;
		case 7:
			System.out.print("Yetmis");
			break;
		case 8:
			System.out.print("Seksen");
			break;
		case 9:
			System.out.print("Doksan");
			break;	
		}
		switch(birler){
		case 1:
			System.out.print(" bir");
			break;
		case 2:
			System.out.print(" iki");
			break;
		case 3:
			System.out.print(" uc");
			break;
		case 4:
			System.out.print(" dort");
			break;
		case 5:
			System.out.print(" bes");
			break;
		case 6:
			System.out.print(" alti");
			break;
		case 7:
			System.out.print(" yedi");
			break;
		case 8:
			System.out.print(" sekiz");
			break;
		case 9:
			System.out.print("dokuz");
			break;	
		}				
	}
}

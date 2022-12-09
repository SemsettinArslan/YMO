package Vize;

import java.util.Scanner;
//ikinci dereceden denklemin köklerini bulma
public class KokBulma {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
			System.out.println("ax2+bx+c=0 Denkleminin a degerini giriniz:");
				double a=giris.nextDouble();
			System.out.println("ax2+bx+c=0 Denkleminin b degerini giriniz:");
				double b=giris.nextDouble();
			System.out.println("ax2+bx+c=0 Denkleminin c degerini giriniz");
				double c=giris.nextDouble();
				double delta=(b*b)-(4*a*c);
			if(delta>0) {
				double x1=( (-1*b) - Math.sqrt(delta) )/(2*a);
				double x2=( (-1*b) + Math.sqrt(delta) )/(2*a);
			System.out.println("x1:"+ x1 +" x2:" + x2);	
			}
			else if(delta==0) {
				double x= (-1*b) /(2*a);
			System.out.println("Cakisik kok vardir x:"+ x);
			}
			else if(delta<0)
				System.out.println("Gercel sayilarda koku yoktur");
	}
}

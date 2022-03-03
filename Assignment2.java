package FirstTerm;

import java.util.Scanner;

public class Assignment2 {
	public static int fx(int fx) {
	int x=fx;
	fx=(5*(200-x))*x;
	return fx;
}
	public static void main(String[] args) {
	 //kummsaati
		/*	System.out.println("sayı gir");
		Scanner girdi = new Scanner(System.in);
		int sayi1 = girdi.nextInt();
		for(int sayac1=0;sayac1<sayi1;sayac1++) {
			for(int sayac2=0;sayac2<sayi1;sayac2++) {
				if(sayac1-sayac2==0) {
					System.out.print("x");
				}
				else if(sayac1+sayac2==sayi1-1) {
					System.out.print("x");
				}
				else {
						System.out.print("o");
				}
					}System.out.println("");
		}
	*/
		//optimum kazanç
		/*
		int b=0; 
		int t=0;
	  int i;
	int k=0;
	  for(i=50;i<201;i++) {
		  if(fx(i)>k) {
                 t=fx(i);
                 b=i;
		  }
		  k=fx(i);
	  }
	  System.out.println("optimum fiyat = "+b );
	  System.out.println("optimum kiralanma adedi = "+fx(b)/b);
	  System.out.println("optimum kazanç = "+t);
*/
	}
}

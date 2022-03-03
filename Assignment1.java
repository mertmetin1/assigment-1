package FirstTerm;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner girdi = new Scanner(System.in);

        System.out.println("lütfen bir kelime girin: ");
        String kelime = girdi.next();
for(int i=0;i<10;i++) {
	System.out.println("");
}
        int sayac = 5; // maximum girdi value
        int uzunluk = kelime.length();
        String görünenkelime = "";

        for (int n = 0; n < uzunluk; n++)
            görünenkelime += '_';

        while (sayac > 0) {

            System.out.println("\nlütfen bir harf tahmin edin: ");
            char tahmin = girdi.next().charAt(0);
            int pozisyon = kelime.indexOf(tahmin);

            for (; pozisyon >= 0; pozisyon = kelime.indexOf(tahmin, pozisyon + 1))
                görünenkelime = görünenkelime.substring(0, pozisyon) + tahmin + görünenkelime.substring(pozisyon + 1);

            System.out.print(görünenkelime + " tahmin hakkınız kaldı: " + sayac);
            sayac--;

            if(görünenkelime.equals(kelime)) {
                System.out.println("\nkazandın");
                break;
            }
        }

        if (!görünenkelime.equals(kelime)) System.out.println("\nkaybettin"); 
 
/*
		
		 	System.out.println("Plaindrome olduğunu düşündüğünüz bir kelime  girin");
			Scanner girdi=new Scanner(System.in);
		String kelime=girdi.next();
		String boş="";
		for(int i =kelime.length()-1;i>=0;i--){
			boş+=kelime.charAt(i);
		}			
		if(boş.equals(kelime)) {
			System.out.println("palindrome kelime");
		}
			else {
				System.out.println("palindrome değil");
			}
		 */
		/*
		 		System.out.println("reverse yapmak istediğin kelimeyi gir");
		Scanner girdi=new Scanner(System.in);
	String kelime=girdi.next();
	String boş="";
	for(int i =kelime.length()-1;i>=0;i--){
		boş+=kelime.charAt(i);
	}			
System.out.println(boş);
		 */
	}

}

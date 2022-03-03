package FirstTerm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Assignment4 {
public static int alfabetikpuanlama(String input) {
	int toplam=0;
	for (int i = 0; i < input.length(); i++) {
		if(input.charAt(i)=='A')
	      toplam+=1;
		else if(input.charAt(i)=='B')
		      toplam+=2;
		else if(input.charAt(i)=='C')
		      toplam+=3;
		else if(input.charAt(i)=='Ç')
		      toplam+=4;
		else if(input.charAt(i)=='D')
		      toplam+=5;
		else if(input.charAt(i)=='E')
		      toplam+=6;
		else if(input.charAt(i)=='F')
		      toplam+=7;
		else if(input.charAt(i)=='G')
		      toplam+=8;
		else if(input.charAt(i)=='Ğ')
		      toplam+=9;
		else if(input.charAt(i)=='H')
		      toplam+=10;
		else if(input.charAt(i)=='İ')
		      toplam+=11;
		else if(input.charAt(i)=='I')
		      toplam+=12;
		else if(input.charAt(i)=='J')
		      toplam+=13;
		else if(input.charAt(i)=='K')
		      toplam+=14;
		else if(input.charAt(i)=='L')
		      toplam+=15;
		else if(input.charAt(i)=='M')
		      toplam+=16;
		else if(input.charAt(i)=='N')
		      toplam+=17;
		else if(input.charAt(i)=='O')
		      toplam+=18;
		else if(input.charAt(i)=='Ö')
		      toplam+=19;
		else if(input.charAt(i)=='P')
		      toplam+=20;
		else if(input.charAt(i)=='R')
		      toplam+=21;
		else if(input.charAt(i)=='S')
		      toplam+=22;
		else if(input.charAt(i)=='Ş')
		      toplam+=23;
		else if(input.charAt(i)=='T')
		      toplam+=24;	
		else if(input.charAt(i)=='U')
		      toplam+=25;
		else if(input.charAt(i)=='Ü')
		      toplam+=26;
		else if(input.charAt(i)=='V')
		      toplam+=27;
		else if(input.charAt(i)=='Y')
		      toplam+=28;
		else if(input.charAt(i)=='Z')
		      toplam+=29;
	}
	return toplam*input.length();
}
public static int puanhesapla(String input) {
	int harfpuan = 0;
		int result;
		for (int i = 0; i < input.length(); i++) {
			harfpuan += input.charAt(i) - '@';
		}
  		result = harfpuan * input.length();
		return result;
	}
	public static void main(String[] args) throws FileNotFoundException {
		File possibleWords = new File("C:\\Users\\90506\\Desktop\\input.txt");// dosyayı bul
		Scanner dosyagirdi = new Scanner(possibleWords);// dosyanın scannerını tnaımla
		String data = dosyagirdi.nextLine(); // satırı yakala
		String[] ArrayOfShuffledWord = data.split(":"); // stringi ,lerde böl ve arrray de depola
		String[] ArrayOfPossibleWords = ArrayOfShuffledWord[1].split(",");
		dosyagirdi.close();
		System.out.println(ArrayOfShuffledWord[0]
				+ " kaırştırılmış kelimedeki harfleri kullanarak anlamlı kelimeleri tahmin et \n 3 hakkın var dikkatli ol");
		Scanner girdi = new Scanner(System.in);
		String str = "";
		int sayac = 3;
		int toplampuan = 0;
		for (int i = 0; i < 3; i++) {
			boolean booleann = true;
			String tahmin2 = girdi.next();
			String tahmin = tahmin2.toUpperCase();
			for (int k = 0; k < ArrayOfPossibleWords.length; k++) {
				if (tahmin.equals(ArrayOfPossibleWords[k])) {
					toplampuan += alfabetikpuanlama(tahmin);
					sayac--;
					System.out.println("tebrikler kelimeyi doğru tahmin ettin");
					if (sayac > 0)
						System.out.println(sayac + " hakkın kaldı");
					else
						System.out.println(" hakkın bitti");
					booleann = false;
					ArrayOfPossibleWords[k] = str;
				}
			}
			if (booleann) {
				System.out.println("üzgünüm bilemedin");
				sayac--;
				if (sayac > 0)
					System.out.println(sayac + " hakkın kaldı");
				else
					System.out.println("hakkın bitti");
			}
		}
		System.out.println("toplam puanın " + toplampuan);
	}
}

package FirstTerm;

import java.util.Scanner;

public class Assignment3 {
	public static void miror(int a) {

		if (a == 1) {
			System.out.print("1");
			return;
		}
		System.out.print(a + ",");
		
		miror(a / 2);
		System.out.print(","+ a);
	}

	static int recursivesayisi = 0;
	static int recursivesayisihelper = 0;

	static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		recursivesayisihelper++;
		return fibonacci(n, a, b);
	}

	static int fibonacci(int n, int a, int b) {
		recursivesayisi++;
		if (n == 0)
			return a;
		if (n == 1)
			return b;
		return fibonacci(n - 1, b, a + b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayı gir");
		int n = scanner.nextInt();
		System.out.println("fibonacci dizisisnin " + n + " inci terimi");
		System.out.println(fibonacci(n));
		System.out.println("main method recursive sayısı " + recursivesayisi);
		System.out.println("helper method recursive sayısı " + recursivesayisihelper);
		/*
		 * daha verimli olsun diye recursive sayısını mümkün olduğunca azaltmaya
		 * çalıştım döngüyle yazmaktansa daha okunabilir ve verimli oldu algılaması ve
		 * çözümlemesi biraz zorladı
		 */
	}
}

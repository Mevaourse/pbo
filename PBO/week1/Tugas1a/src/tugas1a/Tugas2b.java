package tugas1a;

import java.util.Scanner;
import java.util.Locale;

public class Tugas2b {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int alas, tinggi;
		double luas;
		
		System.out.println("Program java menghitung luas segitiga");
		System.out.println("Masukkan alas= ");
		alas = input.nextInt();
		System.out.println("Masukkan tinggi= ");
		tinggi = input.nextInt();
		luas = tinggi*alas*0.5;
		
		System.out.println("Luas segitiga tersebut adalah = " + luas);
		
	}

}
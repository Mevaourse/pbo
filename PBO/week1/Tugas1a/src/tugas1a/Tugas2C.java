package tugas1a;

import java.util.Scanner;
import java.util.Locale;

public class Tugas2C {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int diameter, tinggi;
		double volume,jari2;
		
		System.out.println("Program java menghitung luas segitiga");
		System.out.println("Masukkan diameter= ");
		diameter = input.nextInt();
		jari2 = diameter*0.5;
		System.out.println("Jari-jarinya adalah = " +jari2);
		System.out.println("Masukkan tinggi= ");
		tinggi = input.nextInt();
		volume = 3.14*jari2*jari2*tinggi;
		
		System.out.println("Luas segitiga tersebut adalah = " + volume);
		
	}
}
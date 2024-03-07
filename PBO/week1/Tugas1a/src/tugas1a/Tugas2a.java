package tugas1a;

import java.util.Scanner;
import java.util.Locale;

public class Tugas2a {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int diameter;
		double keliling;
		
		System.out.println("Program java menghitung keliling Lingkaran");
		System.out.println("Masukkan panjang diameter lingkaran = ");
		diameter = input.nextInt();
		keliling = diameter*3.14;
		
		System.out.println("Keliling lingkaran tersebut adalah = " + keliling);
		
	}

}

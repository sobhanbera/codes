package hackerearth;

import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] m) {
		Scanner sc = new Scanner(System.in);
		double pay = sc.nextDouble();
		sc.close();
		
		String us,india,china,france;
		us = china = france = india = null;
		
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
}

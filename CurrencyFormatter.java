package hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        DecimalFormat df = new DecimalFormat("$##,###.##");
        String us = df.format(payment);
        
        df = new DecimalFormat("Rs,##,###.##");
        String india = df.format(payment);
        
        df = new DecimalFormat("￥##,###.##");
        String china = df.format(payment);
        df = new DecimalFormat("##,###.## €");
        String france = df.format(payment).replace(",", " ").replace(".", ",");
        // Write your code here.
        // US: $12,324.13
        // India: Rs.12,324.13
        // China: ￥12,324.13
        // France: 12 324,13 €
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
}

package Sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		
		System.out.print("Enter number of integer in array: ");
		int n =	new Scanner(System.in).nextInt();
		int a[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = new Scanner(System.in).nextInt();
		}
		
		//Bubble sorting algorithm goes here.........
		for(int i = 0 ; i < n-1 ; i++) {
			boolean sorted = true;
			for(int j = 0 ; j < n-1-i ; j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}

package Sorting;

import java.util.Scanner;

public class AliceProblem {

	public static void main(String[] args) {

		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		int ratings[] = new int[n];
		int candy[] = new int[n];
		
		for(int i=0 ; i<ratings.length ; i++) {
			ratings[i] = new Scanner(System.in).nextInt();
		}
		
		for(int i=0 ; i<ratings.length ; i++) {
			candy[i] = 1;
		}
		
		for(int i = 0 ; i<ratings.length-1 ; i++) {
			if(ratings[i+1] > ratings[i]) {
				candy[i+1] = candy[i] + 1;
				System.out.println("1. "+i+" "+candy[i]);
			}
		}
		
		for(int i = ratings.length-1 ; i>0;i--) {
			if(ratings[i-1] > ratings[i]) {
				candy[i-1] = candy[i] + 1;
				System.out.println("2. "+i+" "+candy[i]);
			}
		}
		
		for(int i:candy) {
			sum += i;
		}

		System.out.println("Total Candy To Buy: "+sum);
	}

}

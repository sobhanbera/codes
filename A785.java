package codeforces;

import java.util.Scanner;

public class A785 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < t; i++) {
			String name = sc.next();
			name = name.toLowerCase();
			if(name.equals("tetrahedron"))
				sum += 4;
			else if(name.equals("cube"))
				sum += 6;
			else if(name.equals("octahedron"))
				sum += 8;
			else if(name.equals("dodecahedron"))
				sum += 12;
			else if(name.equals("icosahedron"))
				sum += 20;
			
		}
		sc.close();
		System.out.println(sum);
	}
}

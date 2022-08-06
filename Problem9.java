package projectEuler;

public class Problem9 {
	
	public static void main(String[] args) {
		
		//ans is i=200, j=375, k=425 & i*j*k=31875000
		for(int i=0; i<500; i++) {
			for(int j=0; j<500; j++) {
				for(int k=0; k< 500; k++) {
					if(i != 0 && j != 0 && k != 0) {
						int sum = i+j+k;
						if(Number.isPythagoreanTriplet(i, j, k) && sum == 1000) {
							System.out.print(i +" " +j+" "+k);
							System.out.println(" "+sum);
							int mul = i*j*k;
							System.out.println(" " + mul);
						}
					}
				}
			}
		}
	}
}

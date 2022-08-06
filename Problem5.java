package projectEuler;

public class Problem5 {

	public static void main(String[] args) {

		int num = 1;
		while(true) {
			boolean found = true;
			for(int i=1; i<=20;i++) {
				found = true;
				if(num % i != 0) {
					found = false;
					break;
				}
			}
			if(found) {
				System.out.println(num);
				System.exit(0);
			}
			num++;
		}
	}
}

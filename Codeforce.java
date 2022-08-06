import java.util.Scanner;

class Codeforce{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //number of problems..
		int[][] sure = new int[n][3];
		boolean[] sb = new boolean[n];

		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				sure[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for(int i=0; i<n; i++){
			sum = 0;
			for(int j=0; j<3; j++){
				if(sure[i][j] == 1)
					sum += 1;
			}
			if(sum >= 2)
				sb[i] = true;
			else
				sb[i] = false;
		}
		sum = 0;
		for(boolean b : sb){
			if(b)
				sum++;
		}
		System.out.println(sum);
		sc.close();

	}
}
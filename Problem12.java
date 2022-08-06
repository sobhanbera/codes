package projectEuler;

public class Problem12 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int numOfFac = 1;
		int sum = 0, num = 1;
		while(true) {
			sum += num;
			int n = Number.factorsOf(sum,true).size();
			if(n == 501) {
				numOfFac = n;
				break;
			}
			num++;
		}
		System.out.println(sum+"->"+numOfFac);
	}
}

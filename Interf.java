package Oops;

class UI implements Joker{

	int n=6;
	public int divisor_sum(int n) {
		int m=0;
		for(int i=0;i<=n;i++) {
			if(n%i==0)
				m+=i;
		}
		return m; 
	}
}

public class Interf{
	
	public static void main(String[] args) {
		UI joker = new UI();
		if(joker instanceof UI)
			System.out.println("Yes");
	}
}
package projectEuler;

public class Problem4
{
	public static void main(String[] args) {

        int num = 0;
        int large = 0;
		for(int i = 100;i<1000; i++){
		    for(int j = 100;j<1000; j++){
		        num = i * j;
		        if(isPalindrome(num) && large < num){
		            large = num;
		        }
		    }
		}
		System.out.println(large);
	}
	
	public static boolean isPalindrome(long number) {
		long r = 0, time = number;
		while(time != 0) {
			 r *= 10;
			 r += time % 10;
			 time /= 10;
		}
		if(number == r)
			return true;
		return false;
	}
}

package CP;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		
		int n = s.length();
		System.out.println(n);
        for(int i=0,j=n-1; i<n/2; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
            	return false;
            }
        }
		
		return true;
	}//"^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$"

}

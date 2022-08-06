import java.util.*;

public class HackerrankProbSolving{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();

		System.out.println(encrypt(pass));
		sc.close();
	}

	public static String encrypt(String pass){
		for(int i = 0; i < pass.length(); i++){
			// if(pass.charAt(i) != null && pass.charAt(i+1) != null){
			// 	if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122 && pass.charAt(i+1) >= 65 && pass.charAt(i+1) <= 90){
			// 		char temp = pass.charAt(i);
			// 		String.valueOf(pass.charAt(i)) = String.valueOf(pass.charAt(i+1));
			// 		String.valueOf(pass.charAt(i+1)) = String.valueOf(temp);
			// 	}
			// }else if(pass.charAt(i) != null){

			// }
		}
		return "";
	}
}
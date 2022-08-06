package Oops;

class Student{
	String name;
	int age;
	int clas;
	
	public void printDetails() {
		System.out.println("Name : " + name + "Age : " + age + "Class : " + clas);
	}
}

public class MainClass {

	public static void main(String[] args) {

		String reversedStr = "The sky is blue";
		System.out.println(reverseString(reversedStr));
		
	}
	
	static String reverseString(String s) {
		
		int x = s.length()-1;
		String ans = "";
		
		while(x >= 0) {
			
			while(x >= 0 && s.charAt(x) == ' ') x--;
			
			int j = x;
			
			if(x<0)
				break;
			
			while(x >= 0 && s.charAt(x) != ' ') x--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(x +1 ,j+1));
			}else {
				ans = ans.concat(" " + s.substring(x+1,j+1));
			}
		}
		return ans;
	}

}
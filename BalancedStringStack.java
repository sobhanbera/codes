package Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedStringStack {

	
	/* this
	 * is
	 * not
	 * a
	 * good 
	 * optimization 
	 * for 
	 * balanced 
	 * brackets 
	 * question...*/
	public static void main(String[] args) {
//		{ --> 123
//		} --> 125
//		[ --> 91
//		] --> 93
//		( --> 40
//		) --> 41

		String string = new Scanner(System.in).next();
		char cArray[] = string.toCharArray();
		Stack<Character> cStack = new Stack<>();
		
		if(string.isEmpty()) {
			System.out.println("String Is Empty.");
		}else {
			for(int i=0; i<cArray.length; i++) {
				char toCheck = cArray[i];
				if((int)toCheck == 123 || 
						(int)toCheck == 91 || 
						(int)toCheck == 40) {
					cStack.push(toCheck);
				}else {
					try {
						if(((int)toCheck == 125 && 
								(int)cStack.peek() == 123)||
								((int)toCheck == 41 && 
								(int)cStack.peek() == 40)||
								((int)toCheck == 93 && 
								(int)cStack.peek() == 91))
							if(!cStack.isEmpty())
								cStack.pop();
					}catch(Exception e) {
						System.out.println("Empty String Found!");
					}
				}
			}
		}
		
		if(cStack.isEmpty()) 
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		System.out.println("The size of array is:" + string.length());
		
	}
}









































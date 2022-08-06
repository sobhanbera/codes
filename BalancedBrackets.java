package hackerrank;

import java.util.*;

class Parser{
	
	static class stack  
    { 
        int top=-1; 
        char items[] = new char[100]; 
  
        void push(char x)  
        { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
  
        char pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
  
        boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
    } 
      
    static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
    static boolean isBalanced(String str)
    { 
    	char[] exp = str.toCharArray();
       stack st=new stack(); 
       
       for(int i=0;i<exp.length;i++) 
       { 
            
          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
            st.push(exp[i]); 
       
          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
          { 
                   
             if (st.isEmpty()) 
               { 
                   return false; 
               }  
       
             else if ( !isMatchingPair(st.pop(), exp[i]) ) 
               { 
                   return false; 
               } 
          } 
            
       } 
          
       if (st.isEmpty()) 
         return true; 
       else
         {   
             return false; 
         }  
    }  
}

public class BalancedBrackets {

	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}

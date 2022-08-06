package hackerrank;

import java.util.*;

import com.sun.jdi.Method;


class Stud{
	public String name() {
		return "";
	}
	public void anagram() {
		
	}
	public void go() {
		
	}
	public int run() {
		return 0;
	}
}

public class JavaReflection {

    public static void main(String[] args){
        Class student = Stud.class;
        java.lang.reflect.Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(java.lang.reflect.Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
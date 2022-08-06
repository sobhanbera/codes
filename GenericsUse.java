package Source;

import java.util.LinkedList;
import java.util.Scanner;

class Student<E extends Number> {
	
	String name;
	int age;
	
	Student(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}

class Static{
	
	int i;

	//member class...
	class member{
		int j;
	}
	
	//static class..
	static class stati{
		int k;
	}
	
}

class Anonymous{
	
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		
	}
}

interface Anonym1{
	
	public void print(int n);
//	public void display();
}

public class GenericsUse {

	public static void main(String[] args) {
		
//		LinkedList<Student> list = new LinkedList<>();
//		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.next();
//		int age = scanner.nextInt();
//		
//		Student<Integer> stud = new Student<>(name, age);
//
//		list.add(stud);
//		
//		System.out.println(list);
		
		//initializing member and static class..
		Static s = new Static();
		//using i variable.
		s.i = 0;
		//member
		Static.member m = s.new member();
		//using j.
		m.j = 0;
		Static.stati st = new Static.stati();
		//using k.
		st.k = 0;
		
		//initializing anonumous class...
		Anonymous a = new Anonymous() {
			public void print() {
				System.out.println("JOKE");
			}
			public void show() {
				System.out.println("Show");
			}
		};
		
		a.print();
		a.show();
		
		Anonym1 ab =(n)->{
			if(n>0) System.out.println("Hello2");
		};
		
		ab.print(1);
	}
}


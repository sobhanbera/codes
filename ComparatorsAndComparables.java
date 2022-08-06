package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		int num = 0;
		if(this.marks > o.marks) num = -1;
		else if(this.marks < o.marks) num = 1;
		System.out.println(num);
		return num;
	}	
}

public class ComparatorsAndComparables {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<>();
		
		stud.add(new Student(19, "Suresh"));
		stud.add(new Student(81, "Rohan"));
		stud.add(new Student(29, "Aman"));
		stud.add(new Student(47, "Jay"));
		stud.add(new Student(90, "Harsh"));
		stud.add(new Student(52, "Umang"));
		
		Collections.sort(stud);

		stud.forEach(System.out::println);
	}
}

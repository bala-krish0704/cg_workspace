

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudent {

	public static void main(String[] args) {
		Student st = new Student(34242,"Rama",45.67f);
		Student st1 = new Student(34243,"Kavya",55.67f);
		Student st2 = new Student(34244,"Raj",45.67f);
		ArrayList<Student> data = new ArrayList<Student>();
		data.add(st);
		data.add(st1);
		data.add(st2);
		
		System.out.println("Elements of the arraylist");
		for(Student std:data) {
			System.out.println(std.getStudentId() + "\t" + std.getStudentName() + "\t" + std.getStudentMarks());
		}
		
		//The method sort(List<T>) in the type Collections 
		//is not applicable for the arguments (ArrayList<Student>)
		Collections.sort(data);
		
		System.out.println("Elements of students after sort");
		for(Student std:data) {
			System.out.println(std.getStudentId() + "\t" + std.getStudentName() + "\t" + std.getStudentMarks());
		}
	}

}



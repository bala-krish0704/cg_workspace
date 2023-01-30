import java.util.Scanner;

public class Student_avg {
	public static void main(String[] args) {
		Stu_operation stu = new Stu_operation();
		stu.operation();
	}

}

class Stu_info{
	private int rollNo;
	private int subject1;
	private int subject2;
	private int subject3;


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	
}
class Stu_operation{
	Scanner in = new Scanner(System.in);
	Stu_info[] stu = new Stu_info[8];
	Stu_info si;
	
	
	void storeData() {
		si = new Stu_info();
		System.out.println("Enter the Below data");
		for(int i = 0 ; i < 8; i++) {
			System.out.println("Enter the student roll number ");
			si.setRollNo(in.nextInt());
			System.out.println("Enter the Maths mark");
			si.setSubject1(in.nextInt());
			System.out.println("Enter the Science mark");
			si.setSubject2(in.nextInt());
			System.out.println("Enter the Social mark");
			si.setSubject3(in.nextInt());
			stu[i] = si;
			
		}
	}
	
	void display_stu_mark() {
		float avg;
		for(int i = 0 ; i < 8 ; i++) {
			System.out.println("============Student ["+(i+1)+"}===================");
			System.out.println("Roll number  - "+ stu[i].getRollNo());
			System.out.println("Science mark - " + stu[i].getSubject2());
			System.out.println("Maths mark   - " + stu[i].getSubject1());
			System.out.println("Social mark  - " + stu[i].getSubject3());
			avg = (stu[i].getSubject1()+stu[i].getSubject2()+stu[i].getSubject3())/3;
			System.out.println("Average mark - " + avg);
			System.out.println("=================================================");
		}
	}
	void operation() {
		char ch = 'y';
		int choice = 0;
		while ((ch!= 'y')||( ch!='Y')){
			System.out.println("Select the following operation ");
			System.out.println("1. Enter the student details");
			System.out.println("2 Display student details");
			choice = in.nextInt();
			switch(choice) {
			case 1:
				storeData();
				break;
			case 2:
				display_stu_mark();
				break;
			default:
				System.out.println("Enter the right option ");
				break;				
			}
			System.out.println("Do you want to continue press 'y' or else press 'n' ");
			ch = in.next().charAt(0);
			
		}
		
		
		
	}
	
}

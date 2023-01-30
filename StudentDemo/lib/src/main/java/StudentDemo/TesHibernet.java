package StudentDemo;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Student.util.HibernateUtil;
import StudentDemo.entity.Student;



public class TesHibernet {
	
	public static void main(String...args) {
		Student student = new Student(1235L, "Rama", 67.5f);
		Student student1 = new Student(1245L, "Shiva", 88.7f);
		
		Transaction trans = null;
		
		
		try {
			Session dbSession = HibernateUtil.getSessionFactory().openSession();
			//start the transaction
			trans = dbSession.beginTransaction();
			//save the persistent object/student objects
			//save() method = insert statement in jdbc
			dbSession.save(student);
			dbSession.save(student1);
			trans.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Session dbSession = HibernateUtil.getSessionFactory().openSession();
			//start the transaction
			trans = dbSession.beginTransaction();
			//select * from student;
			List<Student> studentList = dbSession.createQuery("from Student").list();
			System.out.println("=====================================");
			System.out.println("studentName" +"\t" + "studentMarks");
			System.out.println("=====================================");
			studentList.forEach(stud -> System.out.println(stud.getStudentName() +"\t" + stud.getStudentMarks()));

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


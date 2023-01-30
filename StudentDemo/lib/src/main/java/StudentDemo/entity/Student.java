package StudentDemo.entity;

	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	/*
	 * model class = entity class = 
	 * persistence class => 
	 * POJO class (Plain Old Java Object class) => 
	 * which contains data members(variables) + setters + getters + constructors + toString() 
	 */
	@Entity
	public class Student{
		
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		//instance variables
		@Id
		private Long studentId;
		private String studentName;
		private float studentMarks;
		
		
		public Student(Long studentId, String studentName, float studentMarks) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentMarks = studentMarks;
		}
		
		public Long getStudentId() {
			return studentId;
		}
		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public float getStudentMarks() {
			return studentMarks;
		}
		public void setStudentMarks(float studentMarks) {
			this.studentMarks = studentMarks;
		}



}

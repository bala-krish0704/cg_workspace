package com.cg.springboothibernateproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_data")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentid")
	private long studentid;
	
	@Column(name = "studentname")
	private String studentName;
	
	
	@Column(name = "studentmark")
	private float studentMark;


	public long getStudentid() {
		return studentid;
	}


	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public float getStudentMark() {
		return studentMark;
	}


	public void setStudentMark(float studentMark) {
		this.studentMark = studentMark;
	}


	public Student(long studentid, String studentName, float studentMark) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentMark = studentMark;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

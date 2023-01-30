package com.cg.GradelProject1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column(name = "instr_id")
	private Long instructorId;
	
	@Column(name = "instr_fname")
	private String instructorFirstName;
	
	@Column(name = "instr_lname")
	private String instructorLastName;
	
	@Column(name = "instr_email")
	private String instructorEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instr_details_id")
	private InstructorDetails instrDetail;
	
	public InstructorDetails getInstrDetail() {
		return instrDetail;
	}

	public void setInstrDetail(InstructorDetails instrDetail) {
		this.instrDetail = instrDetail;
	}

	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public Instructor(Long instructorId, String instructorFirstName, String instructorLastName,
			String instructorEmail) {
		super();
		this.instructorId = instructorId;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.instructorEmail = instructorEmail;
	}

	public Long getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Long instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
	public String getInstructorEmail() {
		return instructorEmail;
	}
	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}
	
}

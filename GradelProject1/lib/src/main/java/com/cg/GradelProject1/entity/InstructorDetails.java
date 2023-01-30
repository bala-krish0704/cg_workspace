package com.cg.GradelProject1.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")//table name in the db
public class InstructorDetails {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column(name = "instr_id")
	private int instructorDetailId;
	
	@Column(name = "instr_hobby")
	private String instructorHobby;
	
	@Column(name = "instr_youtube")
	private String instructorYoutubeChannel;
	
	public InstructorDetails() {
		// TODO Auto-generated constructor stub
	}

	public InstructorDetails(int instructorDetailId, String instructorHobby, String instructorYoutubeChannel) {
		super();
		this.instructorDetailId = instructorDetailId;
		this.instructorHobby = instructorHobby;
		this.instructorYoutubeChannel = instructorYoutubeChannel;
	}

	public int getInstructorDetailId() {
		return instructorDetailId;
	}

	public void setInstructorDetailId(int instructorDetailId) {
		this.instructorDetailId = instructorDetailId;
	}

	public String getInstructorHobby() {
		return instructorHobby;
	}

	public void setInstructorHobby(String instructorHobby) {
		this.instructorHobby = instructorHobby;
	}

	public String getInstructorYoutubeChannel() {
		return instructorYoutubeChannel;
	}

	public void setInstructorYoutubeChannel(String instructorYoutubeChannel) {
		this.instructorYoutubeChannel = instructorYoutubeChannel;
	}

}

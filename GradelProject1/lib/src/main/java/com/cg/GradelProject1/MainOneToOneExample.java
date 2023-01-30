package com.cg.GradelProject1;

import com.cg.GradelProject1.dao.InstructorDAO;
import com.cg.GradelProject1.entity.Instructor;
import com.cg.GradelProject1.entity.InstructorDetails;

public class MainOneToOneExample {

	public static void main(String[] args) {
		
		//create instructor object
		Instructor instr = new Instructor();
		//set the values to the instructor object
		instr.setInstructorFirstName("Rama");
		instr.setInstructorLastName("Krishna");
		instr.setInstructorEmail("ramk@gmail.com");
		
		
		//create instructor details object
		InstructorDetails instrDet = new InstructorDetails();
		//set values for instructor details object
		instrDet.setInstructorHobby("Playing Cricket");
		instrDet.setInstructorYoutubeChannel("rktechvlogs.com");
		//set instructor details to above instructor object
		instr.setInstrDetail(instrDet);
		
		//save the instructor (which automatically saves the instructor details as cascade
		//option is enabled)
		//create an object for instructor dao
		InstructorDAO instrDao = new InstructorDAO();
		instrDao.insertInstructor(instr);
		
		//to display all instructor
		instrDao.getAllInstructors();

	}

}


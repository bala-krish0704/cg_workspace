package com.cg.GradelProject1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.GradelProject1.config.HibernateConfig;
import com.cg.GradelProject1.entity.Instructor;



public class InstructorDAO {
	
	public void insertInstructor(Instructor instr) {
		
		Transaction hibTrans = null;
		Session dbSession = null;
		try {
			dbSession = HibernateConfig.getSessionFactory().openSession();
			//start the transaction
			hibTrans = dbSession.beginTransaction();
			//save the instructor object
			dbSession.save(instr);
			//commit the transaction
			hibTrans.commit();
		}catch (Exception e) {
			if(hibTrans !=null) {
				hibTrans.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	//to read all instructors from the DB
	public void getAllInstructors() {
		Transaction hibTrans = null;
		Session dbSession = null;
		try {
			dbSession = HibernateConfig.getSessionFactory().openSession();
			//start the transaction
			hibTrans = dbSession.beginTransaction();
			//get all the instructors object
			List<Instructor> instructorList = dbSession.createQuery("from Instructor").list();
			System.out.println("Instructor First Name \t Instructor Email");
			instructorList.forEach(instr ->System.out.println(instr.getInstructorFirstName() + "\t" + instr.getInstructorEmail()));
		}catch (Exception e) {
			if(hibTrans !=null) {
				hibTrans.rollback();
			}
			e.printStackTrace();
		}
	}

}


package com.cg.GradelProject1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.GradelProject1.config.HibernateConfig;
import com.cg.GradelProject1.entity.InstructorDetails;



public class InstructorDetailsDAO {
public void insertInstructorDetail(InstructorDetails instrDetails) {
		
		Transaction hibTrans = null;
		Session dbSession = null;
		try {
			dbSession = HibernateConfig.getSessionFactory().openSession();
			//start the transaction
			hibTrans = dbSession.beginTransaction();
			//save the instructor object
			dbSession.save(instrDetails);
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
			List<InstructorDetails> instructorDetailsList = dbSession.createQuery("from InstructorDetail").list();
			System.out.println("Instructor First Name \t Instructor Email");
			instructorDetailsList.forEach(instrDet ->System.out.println(instrDet.getInstructorHobby() + "\t" + instrDet.getInstructorYoutubeChannel()));
		}catch (Exception e) {
			if(hibTrans !=null) {
				hibTrans.rollback();
			}
			e.printStackTrace();
		}
	}
}

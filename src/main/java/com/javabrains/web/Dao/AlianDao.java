package com.javabrains.web.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javabrains.web.Util.Utility;
import com.javabrains.web.Model.Alian;
import com.javabrains.web.Util.Utility;

public class AlianDao {
	
	public Alian getAlian(int aid)
	{
		Alian a = new Alian();
		a.setAid(101);
		a.setAname("mona");
		a.setTech("java");
		return a;
	}
	
	public int saveAlian(Alian a)
	{
	
		  Transaction transaction = null;
	        try (Session session = Utility.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student objects
	            session.save(a);
	            
	            // commit transaction
	            transaction.commit();
	            return 1;
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	                return 0;
	            }
	            e.printStackTrace();
	        }
			return 0;
		
	}

}

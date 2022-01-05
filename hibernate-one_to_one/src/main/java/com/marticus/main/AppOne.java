package com.marticus.main;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Address;
import com.marticus.dao.Student2;
import com.marticus.util.HibernateUtil;
import com.marticus.dao.*;
public class AppOne {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
	try {
		transaction = session.beginTransaction();

		Set<Phone> phoneNumbers = new HashSet<Phone>();
		phoneNumbers.add(new Phone("house","32354353"));
		phoneNumbers.add(new Phone("mobile","9889343423"));
	
		Student2 student = new Student2("Eswar", phoneNumbers);
		session.save(student);

		transaction.commit();
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		session.close();
		}
	
	}

}

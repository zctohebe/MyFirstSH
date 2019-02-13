package com.user.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.dao.StudentDao;
import com.user.entity.Student;
import com.user.utils.HibernateUtils;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void saveStudent(Student stu) {
		//hhhhhhh
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(stu);
			tx.commit();
		} catch (Exception e) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtils.closeSession(session);
		}
	}

}

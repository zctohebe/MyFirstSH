package com.user.serviceImpl;

import com.user.dao.StudentDao;
import com.user.daoImpl.StudentDaoImpl;
import com.user.entity.Student;
import com.user.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		//develop2 commit
		StudentDao studentDao = new StudentDaoImpl();
		studentDao.saveStudent(student);
	}

}

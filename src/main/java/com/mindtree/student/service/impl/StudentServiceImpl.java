package com.mindtree.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.entity.Student;
import com.mindtree.student.dao.StudentDao;
import com.mindtree.student.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Mono<Student> createStudent(Student student) {
		return studentDao.createStudent(student);
	}

	@Override
	public Mono<Student> viewStudentById(int sid) {
		return studentDao.viewStudentById(sid);
	}

	@Override
	public Flux<Student> viewAllStudents() {
		return studentDao.viewAllStudents();
	}

}

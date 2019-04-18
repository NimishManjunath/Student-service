package com.mindtree.student.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.entity.Student;
import com.mindtree.student.dao.StudentDao;
import com.mindtree.student.utility.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Mono<Student> createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Mono<Student> viewStudentById(int sid) {
		return studentRepository.findById(sid);
	}

	@Override
	public Flux<Student> viewAllStudents() {
		return studentRepository.findAll();
	}

}

package com.mindtree.student.service;

import org.springframework.stereotype.Service;

import com.mindtree.entity.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface StudentService {

	public Mono<Student> createStudent(Student student);

	public Mono<Student> viewStudentById(int sid);

	public Flux<Student> viewAllStudents();

}

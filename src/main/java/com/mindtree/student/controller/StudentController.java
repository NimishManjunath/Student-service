package com.mindtree.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Student;
import com.mindtree.student.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/newStudent")
	public Mono<Student> createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping(value = "/viewStudent/{sid}")
	public Mono<Student> viewStudentById(@PathVariable int sid) {
		return studentService.viewStudentById(sid);
	}
	
	@GetMapping(value = "/viewAllStudents")
	public Flux<Student> viewAllStudents() {
		return studentService.viewAllStudents();
	}
	
}
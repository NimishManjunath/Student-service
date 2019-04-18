package com.mindtree.student.utility;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.Student;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, Integer>{

}

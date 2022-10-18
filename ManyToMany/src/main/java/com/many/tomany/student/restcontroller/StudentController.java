package com.many.tomany.student.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.many.tomany.student.model.Student;
import com.many.tomany.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	@GetMapping("/get")
	public List<Student> listAllTHeStudents(){
		return service.listAllTheStudentsDetails();
	}
	
	@PostMapping
	public Student postMAppingForStudent(@RequestBody
			Student student) {
		return service.postMapping(student);
	}
}

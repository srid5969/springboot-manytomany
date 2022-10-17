package com.many.tomany.course.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.many.tomany.course.model.Course;
import com.many.tomany.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/get")
	public List<Course> listAllCourse(){
		return service.listAllCourse();
	}
	@PostMapping
	public Course postMappingForCourse(@RequestBody Course course) {
		return service.postCourseDeteils(course);
	}

}

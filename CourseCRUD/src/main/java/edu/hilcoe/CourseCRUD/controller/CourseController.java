package edu.hilcoe.CourseCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hilcoe.CourseCRUD.service.CourseService;

@RestController
@RequestMapping
public class CourseController {
	@Autowired
	CourseService course_service;
	@GetMapping("/courses")
	public ResponseEntity<Object> displayCourses(){
		return new ResponseEntity<Object>(course_service.getStudents(), HttpStatus.ACCEPTED);
	}

}

package edu.hilcoe.CourseCRUD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.hilcoe.CourseCRUD.model.Course;
import edu.hilcoe.CourseCRUD.service.CourseService;

@RestController
@RequestMapping  
public class CourseController {
	@Autowired
	CourseService course_service;

	@GetMapping("/courses")
	public ResponseEntity<Object> displayCourses() {
		return new ResponseEntity<Object>(course_service.getCourses(), HttpStatus.ACCEPTED);
	}

	@PostMapping
	public ResponseEntity<Object> insertCousre(@RequestBody List<Course> courses ){
		return new ResponseEntity<Object>(course_service.createCourse(courses), HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/courses")
	public ResponseEntity<Object> deleteCourse(@RequestParam long id){
		return new ResponseEntity<Object>(course_service.deleteByID(id), HttpStatus.ACCEPTED);
		
	}
	@PutMapping("/courses/{id}")
	public ResponseEntity<Object> updateCourse(@RequestBody Course course , @PathVariable int id){
		return new ResponseEntity<Object>(course_service.updateCourse(course, id), HttpStatus.ACCEPTED);
		
	}
	
	
	
	
}

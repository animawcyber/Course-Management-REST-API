package edu.hilcoe.CourseCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hilcoe.CourseCRUD.model.Course;
import edu.hilcoe.CourseCRUD.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository course_repo;
	public List<Course> getStudents(){
		return course_repo.findAll();
	}

}

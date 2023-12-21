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

	public List<Course> getCourses() {
		return course_repo.findAll();
	}
	//create list of courses 
	public List<Course> createCourse(List<Course> courses){
		return course_repo.saveAll(courses);
		
	}
	//delete a course 
	public Object deleteByID(long id){
		if (course_repo.findById(id).isPresent()) {
			course_repo.deleteById(id);
			return true;
			
		} else {
			return false;
}
				
	}
	// update a course 
	public Course updateCourse(Course course , long id ) {
		if (course_repo.existsById(id))  {
			Course course2 = course_repo.findById(id).get() ;
			//Course course2 = course_repo.getById(id).get() ;
			course2.setCourse_code(course.getCourse_code());
			course2.setCourse_title(course.getCourse_title());
			course2.setCr_hrs(course.getCr_hrs());
			return course_repo.save(course2);
			
		}
		return null;
		
	}
	
	
	

}

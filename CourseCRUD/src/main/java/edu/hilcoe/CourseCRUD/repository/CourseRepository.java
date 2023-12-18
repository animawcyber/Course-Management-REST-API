package edu.hilcoe.CourseCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hilcoe.CourseCRUD.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

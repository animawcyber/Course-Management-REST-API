package edu.hilcoe.CourseCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String course_title;
	private String course_code;
	private int cr_hrs;
	public Course(long id, String course_title, String course_code, int cr_hrs) {
		super();
		this.id = id;
		this.course_title = course_title;
		this.course_code = course_code;
		this.cr_hrs = cr_hrs;
	}
	public Course() {
		super();
	}
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public int getCr_hrs() {
		return cr_hrs;
	}
	public void setCr_hrs(int cr_hrs) {
		this.cr_hrs = cr_hrs;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course_title=" + course_title + ", course_code=" + course_code + ", cr_hrs="
				+ cr_hrs + "]";
	}

}

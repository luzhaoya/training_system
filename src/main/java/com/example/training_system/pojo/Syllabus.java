package com.example.training_system.pojo;

import java.lang.Integer;

public class Syllabus {

	protected Integer course_id;
	protected Integer student_number;
	protected Integer id;

	public Syllabus() {
	}

	public Syllabus(Integer course_id, Integer student_number, Integer id) {
		 this.course_id = course_id;
		 this.student_number = student_number;
		 this.id = id;
	}

	public Integer getCourse_id() {
		return this.course_id;
	}

	public void setCourse_id(Integer course_id) {
		 this.course_id = course_id;
	}

	public Integer getStudent_number() {
		return this.student_number;
	}

	public void setStudent_number(Integer student_number) {
		 this.student_number = student_number;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

}

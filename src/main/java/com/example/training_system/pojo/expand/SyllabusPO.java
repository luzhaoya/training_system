package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.Syllabus;
import java.lang.Integer;

public class SyllabusPO extends Syllabus {


	public SyllabusPO() {
	}

	public SyllabusPO(Integer course_id, Integer student_number, Integer id) {
		 this.course_id = course_id;
		 this.student_number = student_number;
		 this.id = id;
	}

}

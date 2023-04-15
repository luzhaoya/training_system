package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.StudentInformation;
import java.lang.Integer;
import java.lang.String;

public class StudentInformationVO extends StudentInformation {


	public StudentInformationVO() {
	}

	public StudentInformationVO(String college, String project_experience, String self_introduction, String student_number, String strong_point, String sex, String name, String telephone, Integer age) {
		 this.college = college;
		 this.project_experience = project_experience;
		 this.self_introduction = self_introduction;
		 this.student_number = student_number;
		 this.strong_point = strong_point;
		 this.sex = sex;
		 this.name = name;
		 this.telephone = telephone;
		 this.age = age;
	}

}

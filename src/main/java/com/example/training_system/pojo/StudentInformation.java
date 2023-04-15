package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class StudentInformation {

	protected String college;
	protected String project_experience;
	protected String self_introduction;
	protected String student_number;
	protected String strong_point;
	protected String sex;
	protected String name;
	protected String telephone;
	protected Integer age;

	public StudentInformation() {
	}

	public StudentInformation(String college, String project_experience, String self_introduction, String student_number, String strong_point, String sex, String name, String telephone, Integer age) {
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

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		 this.college = college;
	}

	public String getProject_experience() {
		return this.project_experience;
	}

	public void setProject_experience(String project_experience) {
		 this.project_experience = project_experience;
	}

	public String getSelf_introduction() {
		return this.self_introduction;
	}

	public void setSelf_introduction(String self_introduction) {
		 this.self_introduction = self_introduction;
	}

	public String getStudent_number() {
		return this.student_number;
	}

	public void setStudent_number(String student_number) {
		 this.student_number = student_number;
	}

	public String getStrong_point() {
		return this.strong_point;
	}

	public void setStrong_point(String strong_point) {
		 this.strong_point = strong_point;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		 this.sex = sex;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		 this.telephone = telephone;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		 this.age = age;
	}

}

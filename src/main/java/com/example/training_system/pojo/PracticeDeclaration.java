package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class PracticeDeclaration {

	protected String student_name;
	protected String condition;
	protected Integer student_number;
	protected Integer post_id;
	protected String post_name;
	protected Integer id;
	protected Integer enterprise_id;
	protected String enterprise_name;

	public PracticeDeclaration() {
	}

	public PracticeDeclaration(String student_name, String condition, Integer student_number, Integer post_id, String post_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.student_name = student_name;
		 this.condition = condition;
		 this.student_number = student_number;
		 this.post_id = post_id;
		 this.post_name = post_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

	public String getStudent_name() {
		return this.student_name;
	}

	public void setStudent_name(String student_name) {
		 this.student_name = student_name;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		 this.condition = condition;
	}

	public Integer getStudent_number() {
		return this.student_number;
	}

	public void setStudent_number(Integer student_number) {
		 this.student_number = student_number;
	}

	public Integer getPost_id() {
		return this.post_id;
	}

	public void setPost_id(Integer post_id) {
		 this.post_id = post_id;
	}

	public String getPost_name() {
		return this.post_name;
	}

	public void setPost_name(String post_name) {
		 this.post_name = post_name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getEnterprise_id() {
		return this.enterprise_id;
	}

	public void setEnterprise_id(Integer enterprise_id) {
		 this.enterprise_id = enterprise_id;
	}

	public String getEnterprise_name() {
		return this.enterprise_name;
	}

	public void setEnterprise_name(String enterprise_name) {
		 this.enterprise_name = enterprise_name;
	}

}

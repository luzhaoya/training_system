package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class SyllabusInfo {

	protected String course_content;
	protected String course_name;
	protected Integer id;
	protected Integer enterprise_id;
	protected String enterprise_name;

	public SyllabusInfo() {
	}

	public SyllabusInfo(String course_content, String course_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.course_content = course_content;
		 this.course_name = course_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

	public String getCourse_content() {
		return this.course_content;
	}

	public void setCourse_content(String course_content) {
		 this.course_content = course_content;
	}

	public String getCourse_name() {
		return this.course_name;
	}

	public void setCourse_name(String course_name) {
		 this.course_name = course_name;
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

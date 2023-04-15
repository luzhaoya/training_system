package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class SyllabusInfo {
	private Integer id;
	private String courseContent;
	private String courseName;
	private Integer enterpriseId;
	private String enterpriseName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}

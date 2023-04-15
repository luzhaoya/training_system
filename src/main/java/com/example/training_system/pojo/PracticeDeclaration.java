package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class PracticeDeclaration {

	private Integer id;
	private String studentName;
	private String condition;
	private Integer studentNumber;
	private Integer postId;
	private String postName;
	private Integer enterpriseId;
	private String enterpriseName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
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

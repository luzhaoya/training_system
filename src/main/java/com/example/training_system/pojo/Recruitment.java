package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class Recruitment {

	private Integer id;
	private String technicalRequirement;
	private String condition;
	private String name;
	private String postType;
	private Integer salary;
	private Integer enterpriseId;
	private String workplace;
	private String enterpriseName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTechnicalRequirement() {
		return technicalRequirement;
	}

	public void setTechnicalRequirement(String technicalRequirement) {
		this.technicalRequirement = technicalRequirement;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}

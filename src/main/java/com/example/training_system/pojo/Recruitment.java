package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class Recruitment {

	protected String technical_requirement;
	protected String condition;
	protected String name;
	protected String post_type;
	protected Integer id;
	protected Integer salary;
	protected Integer enterprise_id;
	protected String workplace;
	protected String enterprise_name;

	public Recruitment() {
	}

	public Recruitment(String technical_requirement, String condition, String name, String post_type, Integer id, Integer salary, Integer enterprise_id, String workplace, String enterprise_name) {
		 this.technical_requirement = technical_requirement;
		 this.condition = condition;
		 this.name = name;
		 this.post_type = post_type;
		 this.id = id;
		 this.salary = salary;
		 this.enterprise_id = enterprise_id;
		 this.workplace = workplace;
		 this.enterprise_name = enterprise_name;
	}

	public String getTechnical_requirement() {
		return this.technical_requirement;
	}

	public void setTechnical_requirement(String technical_requirement) {
		 this.technical_requirement = technical_requirement;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		 this.condition = condition;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public String getPost_type() {
		return this.post_type;
	}

	public void setPost_type(String post_type) {
		 this.post_type = post_type;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		 this.salary = salary;
	}

	public Integer getEnterprise_id() {
		return this.enterprise_id;
	}

	public void setEnterprise_id(Integer enterprise_id) {
		 this.enterprise_id = enterprise_id;
	}

	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		 this.workplace = workplace;
	}

	public String getEnterprise_name() {
		return this.enterprise_name;
	}

	public void setEnterprise_name(String enterprise_name) {
		 this.enterprise_name = enterprise_name;
	}

}

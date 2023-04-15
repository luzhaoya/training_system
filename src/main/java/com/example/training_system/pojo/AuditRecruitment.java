package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class AuditRecruitment {

	protected String condition;
	protected Integer post_id;
	protected String post_name;
	protected Integer id;
	protected Integer enterprise_id;
	protected String enterprise_name;

	public AuditRecruitment() {
	}

	public AuditRecruitment(String condition, Integer post_id, String post_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.condition = condition;
		 this.post_id = post_id;
		 this.post_name = post_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		 this.condition = condition;
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

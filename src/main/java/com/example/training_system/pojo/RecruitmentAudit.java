package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class RecruitmentAudit {

	protected String student_name;
	protected String recruit_name;
	protected String condition;
	protected Integer student_number;
	protected Integer id;
	protected Integer enterprise_id;
	protected String enterprise_name;
	protected Integer recruit_id;

	public RecruitmentAudit() {
	}

	public RecruitmentAudit(String student_name, String recruit_name, String condition, Integer student_number, Integer id, Integer enterprise_id, String enterprise_name, Integer recruit_id) {
		 this.student_name = student_name;
		 this.recruit_name = recruit_name;
		 this.condition = condition;
		 this.student_number = student_number;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
		 this.recruit_id = recruit_id;
	}

	public String getStudent_name() {
		return this.student_name;
	}

	public void setStudent_name(String student_name) {
		 this.student_name = student_name;
	}

	public String getRecruit_name() {
		return this.recruit_name;
	}

	public void setRecruit_name(String recruit_name) {
		 this.recruit_name = recruit_name;
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

	public Integer getRecruit_id() {
		return this.recruit_id;
	}

	public void setRecruit_id(Integer recruit_id) {
		 this.recruit_id = recruit_id;
	}

}

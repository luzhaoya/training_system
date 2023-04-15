package com.example.training_system.pojo;

import java.lang.Integer;
import java.lang.String;

public class EnterpriseInformation {

	protected String condition;
	protected String address;
	protected String name;
	protected String main_business;
	protected String Scale;
	protected Integer id;
	protected String contact_number;
	protected String corporate_representative;

	public EnterpriseInformation() {
	}

	public EnterpriseInformation(String condition, String address, String name, String main_business, String Scale, Integer id, String contact_number, String corporate_representative) {
		 this.condition = condition;
		 this.address = address;
		 this.name = name;
		 this.main_business = main_business;
		 this.Scale = Scale;
		 this.id = id;
		 this.contact_number = contact_number;
		 this.corporate_representative = corporate_representative;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		 this.condition = condition;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		 this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public String getMain_business() {
		return this.main_business;
	}

	public void setMain_business(String main_business) {
		 this.main_business = main_business;
	}

	public String getScale() {
		return this.Scale;
	}

	public void setScale(String Scale) {
		 this.Scale = Scale;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getContact_number() {
		return this.contact_number;
	}

	public void setContact_number(String contact_number) {
		 this.contact_number = contact_number;
	}

	public String getCorporate_representative() {
		return this.corporate_representative;
	}

	public void setCorporate_representative(String corporate_representative) {
		 this.corporate_representative = corporate_representative;
	}

}

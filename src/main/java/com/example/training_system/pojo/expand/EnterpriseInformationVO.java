package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.EnterpriseInformation;
import java.lang.Integer;
import java.lang.String;

public class EnterpriseInformationVO extends EnterpriseInformation {


	public EnterpriseInformationVO() {
	}

	public EnterpriseInformationVO(String condition, String address, String name, String main_business, String Scale, Integer id, String contact_number, String corporate_representative) {
		 this.condition = condition;
		 this.address = address;
		 this.name = name;
		 this.main_business = main_business;
		 this.Scale = Scale;
		 this.id = id;
		 this.contact_number = contact_number;
		 this.corporate_representative = corporate_representative;
	}

}

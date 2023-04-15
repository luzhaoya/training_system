package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.Recruitment;
import java.lang.Integer;
import java.lang.String;

public class RecruitmentVO extends Recruitment {


	public RecruitmentVO() {
	}

	public RecruitmentVO(String technical_requirement, String condition, String name, String post_type, Integer id, Integer salary, Integer enterprise_id, String workplace, String enterprise_name) {
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

}

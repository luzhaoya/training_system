package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.AuditRecruitment;
import java.lang.Integer;
import java.lang.String;

public class AuditRecruitmentPO extends AuditRecruitment {


	public AuditRecruitmentPO() {
	}

	public AuditRecruitmentPO(String condition, Integer post_id, String post_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.condition = condition;
		 this.post_id = post_id;
		 this.post_name = post_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

}

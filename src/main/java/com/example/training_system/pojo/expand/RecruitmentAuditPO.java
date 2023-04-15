package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.RecruitmentAudit;
import java.lang.Integer;
import java.lang.String;

public class RecruitmentAuditPO extends RecruitmentAudit {


	public RecruitmentAuditPO() {
	}

	public RecruitmentAuditPO(String student_name, String recruit_name, String condition, Integer student_number, Integer id, Integer enterprise_id, String enterprise_name, Integer recruit_id) {
		 this.student_name = student_name;
		 this.recruit_name = recruit_name;
		 this.condition = condition;
		 this.student_number = student_number;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
		 this.recruit_id = recruit_id;
	}

}

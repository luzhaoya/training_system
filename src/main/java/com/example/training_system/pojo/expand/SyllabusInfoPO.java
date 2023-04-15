package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.SyllabusInfo;
import java.lang.Integer;
import java.lang.String;

public class SyllabusInfoPO extends SyllabusInfo {


	public SyllabusInfoPO() {
	}

	public SyllabusInfoPO(String course_content, String course_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.course_content = course_content;
		 this.course_name = course_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

}

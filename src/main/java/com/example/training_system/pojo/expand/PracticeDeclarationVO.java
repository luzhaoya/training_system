package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.PracticeDeclaration;
import java.lang.Integer;
import java.lang.String;

public class PracticeDeclarationVO extends PracticeDeclaration {


	public PracticeDeclarationVO() {
	}

	public PracticeDeclarationVO(String student_name, String condition, Integer student_number, Integer post_id, String post_name, Integer id, Integer enterprise_id, String enterprise_name) {
		 this.student_name = student_name;
		 this.condition = condition;
		 this.student_number = student_number;
		 this.post_id = post_id;
		 this.post_name = post_name;
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
	}

}

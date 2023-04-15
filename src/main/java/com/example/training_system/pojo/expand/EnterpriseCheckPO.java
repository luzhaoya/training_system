package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.EnterpriseCheck;
import java.lang.Integer;
import java.lang.String;

public class EnterpriseCheckPO extends EnterpriseCheck {


	public EnterpriseCheckPO() {
	}

	public EnterpriseCheckPO(Integer id, Integer enterprise_id, String enterprise_name, String check_status) {
		 this.id = id;
		 this.enterprise_id = enterprise_id;
		 this.enterprise_name = enterprise_name;
		 this.check_status = check_status;
	}

}

package com.example.training_system.pojo.expand;

import com.example.training_system.pojo.Account;
import java.lang.Integer;
import java.lang.String;

public class AccountPO extends Account {


	public AccountPO() {
	}

	public AccountPO(String password, String role, Integer id, Integer entity_id, String account) {
		 this.password = password;
		 this.role = role;
		 this.id = id;
		 this.entity_id = entity_id;
		 this.account = account;
	}

}

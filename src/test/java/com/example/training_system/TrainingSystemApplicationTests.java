package com.example.training_system;

import com.example.training_system.dao.AccountManagementDAO;
import com.example.training_system.pojo.Account;
import com.example.training_system.service.accountManagement.AccountManagement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrainingSystemApplicationTests {

//    @Autowired
//    private AccountManagement accountManagement;
    @Autowired
    private AccountManagementDAO accountManagementDAO;
    @Test
    void contextLoads() {
        Account account = new Account();
        account.setAccount("123456");
        account.setPassword("123456");
        account.setRole("学生");
//        System.out.println(accountManagement.register(account));

        accountManagementDAO.insert(account);
    }

}

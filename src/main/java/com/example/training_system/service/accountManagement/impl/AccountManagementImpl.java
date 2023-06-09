package com.example.training_system.service.accountManagement.impl;

import com.example.training_system.dao.AccountManagementDAO;
import com.example.training_system.pojo.Account;
import com.example.training_system.service.accountManagement.AccountManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账号管理
 * @author wangtieliang
 * @since 2023-04-15
 */
@Service
public class AccountManagementImpl implements AccountManagement {
    @Autowired
    private AccountManagementDAO accountManagementDAO;
    @Override
    public Account login(Account account) {
        return accountManagementDAO.login(account);
    }

    @Override
    public String register(Account account) {
        if (null != accountManagementDAO.judgeAccount(account)){
            return "no";
        }
        if (accountManagementDAO.insert(account) != 0){
            return "yes";
        }else {
            return "no";
        }

    }
}

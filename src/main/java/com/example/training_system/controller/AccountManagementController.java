package com.example.training_system.controller;

import com.example.training_system.pojo.Account;
import com.example.training_system.service.accountManagement.AccountManagement;
import com.example.training_system.util.JsonUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 账号管理
 * @author wangtieliang
 * @since 2023-04-15
 */
@RestController
@RequestMapping("training_system/enterprise/accountManagement")
public class AccountManagementController {
    @Autowired
    private AccountManagement accountManagement;
    @PostMapping(value = "/login", produces = "application/json; charset=utf-8")
    public String login(@RequestBody Account account, HttpServletResponse res) {
        var login = accountManagement.login(account);
        if (null != login){
            Cookie id = new Cookie("id", String.valueOf(login.getId()));
            Cookie role = new Cookie("role", login.getRole());
            Cookie entityId = new Cookie("entityId", login.getEntityId());
            id.setHttpOnly(true);
            id.setMaxAge(6000);
            role.setHttpOnly(true);
            role.setMaxAge(6000);
            entityId.setHttpOnly(true);
            entityId.setMaxAge(6000);
            res.addCookie(id);
            res.addCookie(role);
            res.addCookie(entityId);
        }

        return JsonUtil.get().assemble(login);
    }

    @PostMapping(value = "/register", produces = "application/json; charset=utf-8")
    public String register(@RequestBody Account account){
        return JsonUtil.get().assemble(accountManagement.register(account));
    }

}

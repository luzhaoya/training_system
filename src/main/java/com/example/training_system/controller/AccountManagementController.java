package com.example.training_system.controller;

import com.example.training_system.pojo.Account;
import com.example.training_system.pojo.Hello;
import com.example.training_system.service.accountManagement.AccountManagement;
import com.example.training_system.util.JsonUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 账号管理
 * @copyright 海南华德科技有限公司
 * @author wangtieliang
 * @since 2023-04-15
 */
@RestController
@RequestMapping("training_system/enterprise/accountManagement")
public class AccountManagementController {
    @Autowired
    private AccountManagement accountManagement;
    @RequestMapping(value = "/login", produces = "application/json; charset=utf-8")
    public String login(HttpServletResponseWrapper res, Account account) {
        var login = accountManagement.login(account);

        Cookie id = new Cookie("id", String.valueOf(login.getId()));
        id.setHttpOnly(true);
        id.setMaxAge(6000);
        Cookie role = new Cookie("role", login.getRole());
        role.setHttpOnly(true);
        role.setMaxAge(6000);
        Cookie entityId = new Cookie("entityId", String.valueOf(login.getEntityId()));
        entityId.setHttpOnly(true);
        entityId.setMaxAge(6000);

        res.addCookie(id);
        res.addCookie(role);
        res.addCookie(entityId);

        return JsonUtil.get().assemble(login);
    }
}

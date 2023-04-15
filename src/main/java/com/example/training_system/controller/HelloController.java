package com.example.training_system.controller;

import com.example.training_system.pojo.Hello;
import com.example.training_system.util.JsonUtil;
import jakarta.servlet.http.Cookie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/x1", produces = "application/json; charset=utf-8")
    public String x1() {
        var hello = new Hello();
        hello.setId(1);
        hello.setName("傻逼");
        return JsonUtil.get().assemble(hello);
    }
}

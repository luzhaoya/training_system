package com.example.training_system.controller;

import com.example.training_system.pojo.Hello;
import com.example.training_system.util.JsonUtil;
import jakarta.servlet.http.Cookie;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/x1", produces = "application/json; charset=utf-8")
    public String x1() {
        var hello = new Hello();
        hello.setId(1);
        hello.setName("傻逼2");
        return JsonUtil.get().assemble(hello);
    }


    @PostMapping(value = "/x2", produces = "application/json; charset=utf-8")
    public String x2(@RequestBody Hello hello) {
        System.out.println(hello.getId());
        return JsonUtil.get().assemble(hello);
    }
}

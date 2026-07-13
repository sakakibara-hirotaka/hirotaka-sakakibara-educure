package jp.educure.problem3.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jp.educure.problem3.userservice.service.Userservice;


@RestController
public class UserController {
    private final Userservice userservice;

    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping("/user")
    public String getMethodName() {
        return userservice.showData();
    }
}

package jp.educure.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class LoginCheckAspect {
    private final UserSession userSession;
    private final UserService userService;

    @Autowired
    public LoginCheckAspect(UserSession userSession, UserService userService) {
        this.userSession = userSession;
        this.userService = userService;
    }

    @Before("execution(* jp.educure.login.UserService.getUserDetails())")
    public void checkLogin() {
        if (!userSession.isLoggedIn()) {
            throw new IllegalStateException("Exception: User must be logged in to access this method.");
        }
    }

}

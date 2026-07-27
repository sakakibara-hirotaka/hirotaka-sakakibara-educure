package jp.educure.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class LoginCheckAspect {
    private final UserSession userSession;

    @Autowired
    public LoginCheckAspect(UserSession userSession) {
        this.userSession = userSession;
    }

    @Before("execution(* jp.educure.login.UserService.getUserDetails())")
    public void checkLogin() {
        userSession.isLoggedIn();
    }

}

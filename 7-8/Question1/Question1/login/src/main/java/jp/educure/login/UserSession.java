package jp.educure.login;

import org.springframework.stereotype.Component;

@Component
public class UserSession {

    private boolean loggedIn = true;

    public boolean isLoggedIn() {
        return loggedIn;
    } 
}

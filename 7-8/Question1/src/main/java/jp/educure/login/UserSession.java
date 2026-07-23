package jp.educure.login;

import org.springframework.stereotype.Component;

@Component
public class UserSession {

    private boolean loggedIn = false;

    public boolean login() {
        return loggedIn = true;
    }

    public boolean logout() {
        return loggedIn = false;
    }


    public boolean isLoggedIn() {
        return loggedIn;
    } 
}

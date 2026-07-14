package jp.educure.problem3.userservice.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    
    public String getUserData() {
        return "Sample User Data";
    }
}

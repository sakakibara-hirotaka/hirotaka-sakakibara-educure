package jp.educure.advanced;

import lombok.Data;

@Data
public class User {
    private String name;
    private String role;
    private String status;

    public User(String name, String role, String status) {
        this.name = name;
        this.role = role;
        this.status = status;
    }
}

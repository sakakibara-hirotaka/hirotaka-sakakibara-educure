package jp.educure.management;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private List<User> userdate = new ArrayList<>();

    public void saveData(User user) {
        if(user.getMail().equals("error@example.com")) {
            throw new RuntimeException("Exception while saving user: Error: Unable to save user with email " + user.getMail());
        }
        userdate.add(user);
    }
}

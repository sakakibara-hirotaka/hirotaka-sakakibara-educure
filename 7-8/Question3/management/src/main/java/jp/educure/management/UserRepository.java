package jp.educure.management;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private List<User> userdate = new ArrayList<>();

    public void saveData(User user) {
        userdate.add(user);
    }
}

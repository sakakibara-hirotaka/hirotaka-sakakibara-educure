package jp.educure.management;

import org.springframework.stereotype.Service;

@Service
public class UsermanagementService {
    private final UserRepository userRepository;

    public UsermanagementService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
        
    public void createUser(User user) {
        String name = user.getName();
        String mail = user.getMail();

        try {
            userRepository.saveData(user);
            System.out.println("User saved: " + name + ", " + mail);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}

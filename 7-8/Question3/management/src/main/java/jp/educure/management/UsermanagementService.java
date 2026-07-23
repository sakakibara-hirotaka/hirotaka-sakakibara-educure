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
        try {
            userRepository.saveData(user);
            System.out.println("User saved: " + name + ", " + name + "@example.com");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception while saving user: Error: Unable to save user with email error@example.com");
        }
    }
}

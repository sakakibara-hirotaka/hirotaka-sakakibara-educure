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
        if (mail.equals("error@example.com")){
            throw new IllegalArgumentException("Exception while saving user: Error: Unable to save user with email " + mail);
        }else {
            userRepository.saveData(user);
            System.out.println("User saved: " + name + "," + mail);
        }
    }
}

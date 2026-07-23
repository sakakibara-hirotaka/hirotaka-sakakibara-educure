package jp.educure.login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main1 {

	private final UserSession userSession;

    Main1(UserSession userSession) {
        this.userSession = userSession;
    }

    public static void main(String[] args) {
		SpringApplication.run(Main1.class, args);
	}

	@Bean
	public CommandLineRunner run(UserService userService) {
		return args -> {
			userSession.login();
			//userSession.logout();
			userService.getUserDetails();
		};
	}
}

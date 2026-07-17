package jp.educure.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main3 {
    public static void main(String[] args) {
		
		User user = new User("John Doe","john.doe@example.com");
		//User user = new User("Error User","error@example.com");
		//User user = new User("Jane Smith","jane.smith@example.com");
		//User user = new User("田中太郎","tanaka@example.com");

		var contex = SpringApplication.run(Main3.class, args);
		UsermanagementService service = contex.getBean(UsermanagementService.class);
		service.createUser(user);
		
	}

}

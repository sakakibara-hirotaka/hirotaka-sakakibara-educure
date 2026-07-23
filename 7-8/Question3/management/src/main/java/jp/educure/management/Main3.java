package jp.educure.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main3 {
    public static void main(String[] args) {
		
		User user = new User("John Doe");
		//User user = new User("Error User");
		//User user = new User("Jane Smith");
		//User user = new User("田中太郎");

		var contex = SpringApplication.run(Main3.class, args);
		UsermanagementService service = contex.getBean(UsermanagementService.class);
		service.createUser(user);
		
	}
}

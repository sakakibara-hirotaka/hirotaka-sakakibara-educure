package jp.educure.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main5 {

	public static void main(String[] args) {
		var contex = SpringApplication.run(Main5.class, args);
		PaymentService ps = contex.getBean(PaymentService.class);
		ps.processPayment();
	}

}

package jp.educule.tutorial.Spring53;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main2 {

	public static void main(String[] args) {
		SpringApplication.run(Main2.class, args);
	}

	@Bean
    public CommandLineRunner runner(CalculatorService calculatorService) {
        return args -> {
            int result = calculatorService.add(5, 3) + calculatorService.subtract(10, 5) + calculatorService.miltiply(6, 4) + calculatorService.divide(12, 4);

			/*int subtract = calculatorService.subtract(10, 5);

			int miltiply = calculatorService.miltiply(6, 4);

			int divide = calculatorService.divide(12, 4); */
		};
	}
}

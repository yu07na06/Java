package Pack01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sts01Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Sts01Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Sts01Application.class);
	}
}

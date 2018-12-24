package pkg.FirstExm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWord {

	@RequestMapping("/")
	String home() {
		return "First Example in spring bootdfgdsgsdgd.";
	}
	public static void main(String[] args) throws Exception {
			SpringApplication.run(HelloWord.class, args);
		}

	

	}



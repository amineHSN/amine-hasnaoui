package ma.cigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tp13FrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp13FrontEndApplication.class, args);
		
		
	}
	
	@Bean
	RestTemplate getRest() {
		return new RestTemplate();
	}
	
	
	@Bean
	PasswordEncoder getE()
	{
		return new BCryptPasswordEncoder(); 
	}	

}

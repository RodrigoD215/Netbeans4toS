package pe.edu.tecsup.pcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableConfigurationProperties
public class PccApplication {

	public static void main(String[] args) {
		SpringApplication.run(PccApplication.class, args);


	}


}

package animal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {
	
	@Bean
	public Cat cat(){
		return new Cat();
	}
	@Bean
	public Zoo zoo(){
		return new Zoo( );
	}
}

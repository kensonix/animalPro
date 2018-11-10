package animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

	public void say() {
		System.out.println("I am a dog");
	}
	public Dog getDog(){
		System.out.println("dog bean user");
		return new Dog();
	}

}

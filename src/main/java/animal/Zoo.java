package animal;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {
	@Autowired
	private Animal animal;
//	public Zoo(Animal animal){
//		this.animal = animal;
//	}
	public void animalPlay(){
		System.out.println("who is it ? " );
		animal.say();
	}
}

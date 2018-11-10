package animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnimalConfig.class)
//@ComponentScan(basePackages= "animal")
public class AnimalRunTest {
//	@Autowired
//	private Animal animal;
//	@Test
//	public void run(){
//		animal.say();
//	}
}

package animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ZooConfig.class)
public class ZooRunTest {
	@Autowired
	private Zoo zoo;
	@Test
	public void ZooPlay(){
		zoo.animalPlay();
	}
}

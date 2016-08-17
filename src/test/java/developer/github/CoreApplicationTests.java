package developer.github;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreApplicationTests {

	@Test
	public void contextLoads() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/*-applicationContext.xml");
		System.out.println(context);
	}

}

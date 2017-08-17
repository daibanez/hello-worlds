package z594.helloworld;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

public class HelloTest {

	@Test
	public void defaultMessage() {
		Assert.assertThat(
			Hello.sayHello(),
			CoreMatchers.containsString(Hello.defaultUser)
		);
	}

	@Test
	public void customUsername() {
		String user = "Me";
		Assert.assertThat(
			Hello.sayHello(user),
			CoreMatchers.containsString(user)
		);
	}

}

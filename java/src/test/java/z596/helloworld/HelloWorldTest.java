package z594.helloworld;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

public class UserMessageTest {

	@Test
	public void defaultMessage() {
		Assert.assertThat(
			HelloWorld.sayHello(),
			CoreMatchers.containsString(HelloWorld.defaultUser)
		);
	}

	@Test
	public void customUsername() {
		String user = "Me";
		Assert.assertThat(
			HelloWorld.sayHello(user),
			CoreMatchers.containsString(user)
		);
	}

}

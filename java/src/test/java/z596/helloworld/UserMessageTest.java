package z594.helloworld;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

public class UserMessageTest {

	@Test
	public void defaultMessage() {
		UserMessage testMsg = new UserMessage();
		Assert.assertThat(
			testMsg.toString(),
			CoreMatchers.containsString(UserMessage.getDefaultUsername())
		);
	}

	@Test
	public void customUsername() {
		String username = "Me";
		UserMessage testMsg = new UserMessage(username);
		Assert.assertThat(
			testMsg.toString(),
			CoreMatchers.containsString(username)
		);
	}

	@Test
	public void customMessageTemplate() {
		String prefix = ">>";
		String messageTemplate = prefix + " %s";
		String username = "Me";
		UserMessage testMsg = new UserMessage(messageTemplate,username);
		Assert.assertThat(
			testMsg.toString(),
			CoreMatchers.containsString(prefix)
		);
		Assert.assertThat(
			testMsg.toString(),
			CoreMatchers.containsString(username)
		);
	}

}

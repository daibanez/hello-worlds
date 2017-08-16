package z594.helloworld;

public class UserMessage {

	private static final String defaultMessageTemplate = "Hello %s!";
	private static final String defaultUsername = "World";

	private String messageTemplate;
	private String username;

	public UserMessage() {
		this.messageTemplate = defaultMessageTemplate;
		this.username = defaultUsername;
	}

	public UserMessage(String username) {
		this.messageTemplate = defaultMessageTemplate;
		this.username = username;
	}

	public UserMessage(String messageTemplate, String username) {
		this.messageTemplate = messageTemplate;
		this.username = username;
	}

	public static String getDefaultMessageTemplate() {
		return defaultMessageTemplate;
	}

	public static String getDefaultUsername() {
		return defaultUsername;
	}

	public String getMessageTemplate() {
		return this.messageTemplate;
	}

	public void setMessageTemplate(String messageTemplate) {
		this.messageTemplate = messageTemplate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return String.format(this.messageTemplate, this.username);
	}

}

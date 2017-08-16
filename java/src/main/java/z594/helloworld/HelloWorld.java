package z594.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		if (args.length > 0) {
			for (String s: args) {
				UserMessage msg = new UserMessage(s);
				System.out.println(msg);
			}
		} else {
			UserMessage msg = new UserMessage();
			System.out.println(msg);
		}
	}

}

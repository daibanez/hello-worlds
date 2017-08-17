package z594.helloworld;

public final class HelloWorld {

	public static final String helloTemplate = "Hello %s!";
	public static final String defaultUser = "World";

	public static String sayHello() {
		return sayHello(defaultUser);
	}

	public static String sayHello(String name) {
		return String.format(helloTemplate,name);
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			for (String s: args) {
				System.out.println(sayHello(s));
			}
		} else {
			System.out.println(sayHello());
		}
	}

}

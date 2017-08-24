#!/usr/bin/env node

class Hello {

	static defaultUser: String = "world";

	sayHello(name?: String) {
		if (!name) {
			name = Hello.defaultUser;
		}
		return `Hello ${name}!`
	}

}

console.log('Hello World!')
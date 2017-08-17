using System;
using Xunit;
using HelloWorld;

namespace HelloWorldTest
{
	public class HelloTest
	{

		[Fact]
		public void DefaultMessage() {
			Assert.True(
				Hello.SayHello().Contains(Hello.defaultUser)
			);
		}

		[Fact]
		public void CustomUsername() {
			String user = "Me";
			Assert.True(
				Hello.SayHello(user).Contains(user)
			);
		}


	}
}

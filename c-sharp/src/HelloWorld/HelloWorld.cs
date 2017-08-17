using System;

namespace HelloWorld
{
	class HelloWorld
	{

		public static readonly string helloTemplate;
		public static readonly string defaultUser;

		static UserMessage()
		{
			helloTemplate = "Hello {0}!";
			defaultUser = "World";
		}

		public static string SayHello()
		{
			return SayHello(defaultUser);
		}

		public static string SayHello(string name)
		{
			return String.Format(helloTemplate,name);
		}

		static void Main(string[] args)
		{
			if (args.length > 0)
			{
				for (int i = 0; i < args.Length; i++)
				{
					Console.WriteLine(SayHello(s));
				}
			}
			else
			{
				Console.WriteLine(SayHello());
			}

		}
	}
}

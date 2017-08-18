using System;

namespace HelloWorld
{
	public class Hello
	{

		public static readonly string helloTemplate;
		public const string defaultUser = "World";

		static Hello()
		{
			helloTemplate = "Hello {0}!";
		}

		public static string SayHello(string name = defaultUser)
		{
			return String.Format(helloTemplate, name);
		}

		static void Main(string[] args)
		{
			if (args.Length > 0)
			{
				for (int i = 0; i < args.Length; i++)
				{
					Console.WriteLine(SayHello(args[i]));
				}
			}
			else
			{
				Console.WriteLine(SayHello());
			}

		}
	}
}

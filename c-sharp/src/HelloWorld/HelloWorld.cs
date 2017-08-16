using System;

namespace HelloWorld
{
	class HelloWorld
	{
		static void Main(string[] args)
		{
			if (args.Length > 0)
			{
				for(int i = 0; i < args.Length; i++)
				{
					UserMessage msg = new UserMessage(args[i]);
					Console.WriteLine(msg);
				}
			}
			else
			{
				UserMessage msg = new UserMessage();
				Console.WriteLine(msg);
			}

		}
	}
}

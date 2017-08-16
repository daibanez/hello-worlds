using System;

namespace HelloWorld
{
	class UserMessage
	{
		public static readonly string defaultMessageTemplate;
		public static readonly string defaultUsername;

		public string messageTemplate { get; set; }
		public string username { get; set; }

		static UserMessage()
		{
			defaultMessageTemplate = "Hello {0}!";
			defaultUsername = "World";
		}

		public UserMessage()
		{
			this.messageTemplate = defaultMessageTemplate;
			this.username = defaultUsername;
		}

		public UserMessage(string username)
		{
			this.messageTemplate = defaultMessageTemplate;
			this.username = username;
		}

		public UserMessage(string messageTemplate, string username)
		{
			this.messageTemplate = messageTemplate;
			this.username = username;
		}

		public override string ToString()
		{
			return String.Format(this.messageTemplate, this.username);
		}

	}
}

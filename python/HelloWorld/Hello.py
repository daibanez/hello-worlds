
class Hello:

	helloTemplate = 'Hello, {}!'

	defaultUser = 'World'

	@classmethod
	def say_hello(cls, name = None):
		if name is None:
			name = cls.defaultUser
		return cls.helloTemplate.format(name)

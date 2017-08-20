
class Hello(object):

	hello_template = 'Hello, {}!'
	default_user = 'World'

	@classmethod
	def say_hello(cls, name = None):
		if name is None:
			name = cls.default_user
		return cls.hello_template.format(name)

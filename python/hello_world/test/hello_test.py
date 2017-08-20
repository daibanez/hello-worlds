import unittest

from hello_world import *

class HelloTest(unittest.TestCase):

	def test_default_message(self):
		self.assertIn(Hello.default_user, Hello.say_hello())

	def test_custom_username(self):
		name = 'TestName'
		self.assertIn(name, Hello.say_hello(name))

#if __name__ == '__main__':
#	unittest.main()

suite = unittest.TestLoader().loadTestsFromTestCase(HelloTest)
unittest.TextTestRunner(verbosity=2).run(suite)
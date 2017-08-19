import sys

import HelloWorld.Hello as Hello

if __name__ == '__main__':
	if len(sys.argv[1:]) > 0 :
		for arg in sys.argv[1:] :
			print Hello.Hello.say_hello(arg)
	else:
		print Hello.Hello.say_hello()
	sys.exit()
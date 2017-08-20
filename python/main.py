import sys

from hello_world import Hello

if __name__ == '__main__':
	if len(sys.argv[1:]) > 0 :
		for arg in sys.argv[1:] :
			print Hello.say_hello(arg)
	else:
		print Hello.say_hello()
	sys.exit()
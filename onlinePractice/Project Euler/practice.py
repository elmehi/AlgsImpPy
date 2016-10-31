

import sys


def Hello(name):
	name = name + '!!'
	if name == 'meir!!':
		print 'blagu!'
	else:
		print 'Hello', name


def main():
	Hello(sys.argv[1])


if __name__ == '__main__':
	main()
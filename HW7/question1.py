import sys

# Your iterator implementation here

# Keep the lines below
def main():
	n = int(sys.argv[1])
	for v in move_robot(n):
		print(v)

if __name__ == '__main__':
	main()

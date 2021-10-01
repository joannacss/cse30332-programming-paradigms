# Any import statement you need


# Your class definitions go here



# Implement the parsing of CSV
def loadObjects(csv_file1, csv_file2, csv_file3):
  vulnerabilities = []
  # Your implementation here
  return vulnerabilities



# Implement the queries
def query1():
	return -1

def query2():
	return -1

def query3():
	return -1

def query4():
	return "String"

def query5():
	return "String"



def main():
	# parse program arguments
	csv_file1, csv_file2, csv_file3 = "a","b","c"
	
	# load objects
	vulnerabilities = loadObjects(csv_file1, csv_file2, csv_file3)

	# Print 
	print("Query1=",query1())
	print("Query2=",query2())
	print("Query3=",query3())
	print("Query4=",query4())
	print("Query5=",query5())


if __name__ == '__main__':
	main()
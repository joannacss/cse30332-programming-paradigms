# Any import statement you need


# Your class definitions go here



# Implement the parsing of CSV
def loadObjects(csv_file1, csv_file2, csv_file3):
  vulnerabilities = []
  # Your implementation here
  return vulnerabilities



# Implement the queries
def query1(vulnerabilities):
	return -1

def query2(vulnerabilities):
	return -1

def query3(vulnerabilities):
	return -1

def query4(vulnerabilities):
	return "String"

def query5(vulnerabilities):
	return "String"



def main():
	# parse program arguments
	csv_file1, csv_file2, csv_file3 = "a","b","c"
	
	# load objects
	vulnerabilities = loadObjects(csv_file1, csv_file2, csv_file3)

	# Print 
	print("Query1=",query1(vulnerabilities))
	print("Query2=",query2(vulnerabilities))
	print("Query3=",query3(vulnerabilities))
	print("Query4=",query4(vulnerabilities))
	print("Query5=",query5(vulnerabilities))


if __name__ == '__main__':
	main()
class Student: 
	name = "Default" 

	# default constructor 
	def __init__(self): 
		self.name = "Anonymous"

	# a method for printing data members 
	def print_student(self): 
		print(self.name) 


# creating object of the class 
obj1 = Student() 

# calling the instance method using the object obj 
obj1.print_student() # what is printed here?

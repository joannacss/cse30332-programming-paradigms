# self represents the instance of the class. 
# By using the `self' keyword we can access the attributes and methods of the class.
# It binds the attributes with the given arguments.

class Car: 
	
	# init method or constructor 
	def __init__(self, model, color): 
		self.model = model 
		self.color = color 
		
	def show(self): 
		print("Model is", self.model ) 
		print("color is", self.color ) 
		
# both objects have different self which 
# contain their attributes 
audi = Car("audi a4", "blue") 
ferrari = Car("ferrari 488", "green") 

audi.show()	 # same output as Car.show(audi) 
ferrari.show() # same output as Car.show(ferrari) 

# Behind the scene, in every instance method 
# call, python sends the instances also with 
# that method call like Car.show(audi) 


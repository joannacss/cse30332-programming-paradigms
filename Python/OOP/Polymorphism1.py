#### Built-in polymorphic functions

# len() being used for a string
print(len("geeks"))
# len() being used for a list
print(len([10, 20, 30]))

#### User-defined Polymorphism
def add(x, y, z = 0):
	return x + y+z

# Invocations
print(add(2, 3))
print(add(2, 3, 4))
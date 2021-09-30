# Python code to demonstrate
# call by value
 
 
string = "Geeks"
 
 
def test(string):
     
    string = "GeeksforGeeks"
    print("Inside Function:", string)
     
# Driver's code
test(string)
print("Outside Function:", string)


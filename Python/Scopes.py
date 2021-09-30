import sys

a = 1

def example():
    if a > 0:
        b = 2
        print(b)
    print(b) # should this work?
             # what's the scope for b
def example2():
    print(b)

def example3():
    global c
    c = 3

def example4():
    print(c)

# Invoking function
example()
example2()
example3()
example4()
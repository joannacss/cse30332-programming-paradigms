import sys

a = 1

def scope_example():
    if a > 0:
        b = 2
        print(b)
    print(b) # should this work?
             # what's the scope for b

# Invoking function
scope_example()
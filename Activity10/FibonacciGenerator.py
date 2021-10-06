import sys

def fibonacci(number):
    n = 0
    previous_two = 0 # For n = 0
    previous_one = 1 # For n = 1
    while n < number:
        if n == 0:
            yield 0
        elif n == 1:
            yield 1
        else:
            yield previous_two + previous_one
            temp = previous_one        
            previous_one = previous_two + previous_one
            previous_two = temp
        n += 1


    

def print_sequence(sequence):
    print(", ".join(str(x) for x in sequence))

if len(sys.argv) != 2:
    print("ERROR")
else:
    n = int(sys.argv[1])
    print_sequence(list(fibonacci(n)))
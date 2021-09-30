import sys

def fibonacci(n):
    fib = [0, 1]
    for i in range(2, n + 1):
        fib.append(fib[i - 1] + fib[i - 2])
    return fib[:n+1]

def print_sequence(sequence):
    print(", ".join(str(x) for x in sequence))

if len(sys.argv) != 2:
    print("ERROR")
else:
    n = int(sys.argv[1])
    sequence = fibonacci(n)
    print_sequence(sequence)
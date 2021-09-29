import sys

if len(sys.argv) != 2:
    print("ERROR. Please provide a value for n")
else:
    n = int(sys.argv[1])
    for c in range(1, n): 
        for b in range(1, c): 
            for a in range(1, b): 
                if a * a + b * b == c * c: 
                    print('{}, {}, {}'.format(a,b,c)) 
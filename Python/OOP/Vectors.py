import math 

class Vector: 
    def __init__(self, x, y): 
        self.x = x 
        self.y = y 

    def magnitude(self): 
        return math.sqrt(self.x * self.x + self.y * self.y) 

    def __add__(self, v): 
        return Vector(self.x + v.x, self.y + v.y) 

    def __mul__(self, v): 
        return self.x * v.x + self.y * v.y 

    def __str__(self): 
        return '<{},{}>'.format(self.x, self.y) 

u = Vector(3,4)
v = Vector(-5,10)

assert u.x == 3 
assert u.y == 4 
assert u.magnitude() == 5.0 
assert str(u + v) == '<-2,14>' 
assert u * v == 25


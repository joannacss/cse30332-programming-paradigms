class Animal:
    def __init__(self,name):
        self.name = name
    def speak(self):
        return '{} says {}'.format(self.name,self.sound())

class Cow(Animal):
    def sound(self):
        return 'moooo'

class Horse(Animal):
    def sound(self):
        return 'neigh'

class Sheep(Animal):
    def sound(self):
        return 'baaaa'

class Fox(Animal):
    def sound(self):
        return ''

if __name__=='__main__':
    h = Horse('CJ')
    c = Cow('Bessie')
    s = Sheep('Little Lamb')
    f = Fox('Firefox')
    print(h.speak()) # CJ says neigh
    print(c.speak()) # Bessie says moooo
    print(s.speak()) # Little Lamb says baaaa
    print("What does the Fox say?", f.speak())


    
class Animal 
    def initialize(name) 
        @name = name 
    end 
    def speak() 
        "#{@name} says #{sound()}" 
    end 
end 

class Cow < Animal 
    def sound() 
        "moooo" 
    end 
end 

class Horse < Animal
    def sound() 
        "neigh" 
    end 
end 

class Sheep < Animal
    def sound() 
        "baaaa" 
    end 
end 

# __FILE__ is currently executing file
# %script being run
if __FILE__ == $0 
    s = Horse.new "CJ" 
    puts s.speak # "CJ says neigh" 
    c = Cow.new("Bessie") 
    puts c.speak # "Bessie says moooo" 
    puts Sheep.new("Little Lamb").speak # "Little Lamb says baaaa" 
end 
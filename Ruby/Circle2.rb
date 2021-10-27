class Circle 
    def initialize(x, y, r) 
        @x = x 
        @y = y 
        @r = r 
    end 
    
    # getter  
    def getRadius()
        @r
    end
    # setter  
    def setRadius(new_radius)
        @r = new_radius
    end
    
    
    def center() 
        [@x, @y] 
    end 
 
    def area() 
        Math::PI * @r * @r 
    end 

    def to_s() 
        "Circle at (#{@x}, #{@y}) with radius #{@r}" 
    end 
end 

c = Circle.new(5, 4, 10) 

# accessing private members
c.setRadius(4)          # write 
puts c.getRadius()      # read

 
class Circle 
    def initialize(x, y, r) 
        @x = x 
        @y = y 
        @r = r 
    end 
    
    # accessors  
    attr_reader :r # what happens if we comment this line?
    attr_writer :r # what happens if we comment this line?
    
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
c.r = 4     # write 
puts c.r    # read

 
class Circle 
    def initialize(x, y, r) 
        @x = x 
        @y = y 
        @r = r 
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
puts c.center # [5, 4] 
puts c.area   # 314.1592653589793 = 100 * Math::PI 
 
# to_s is automatically called when in string context 
puts "#{c}"   # "Circle at (5, 4) with radius 10"

 
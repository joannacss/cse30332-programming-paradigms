
class Point
	def initialize(x,y)
		@x = x
		@y = y		
	end
	@@origin = Point.new(0,0)
	
	def print_scopes()
		puts "print_scopes"
		puts "\t" + defined? @@origin # class variable
		puts "\t" + defined? @x   	   # instance-variable
		puts "\t" + defined? @y       # instance-variable
	end

	def sample_method()
		puts "sample_method"
		total = @x + @y
		puts "\t" + defined? total       # local-variable
		if total > 2
			a = 10
			puts "\t" + defined? a       # local-variable
		end
		puts "\t" + defined? a       # ?		
	end	
end




if __FILE__ == $0
	p1 = Point.new(1,2)
	$p2 = Point.new(3,4)
	p1.print_scopes()
	p1.sample_method()
	
	puts "inside if condition"
	puts "\t" + defined? p1 # local-variable
	puts "\t" + defined? $p2 # global-variable
end
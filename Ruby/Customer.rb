# Example modified from: 
# - Link 1: https://www.tutorialspoint.com/ruby/ruby_classes.htm
# - Link 2: https://stackoverflow.com/a/37160915

class Customer
    # static attribute (aka class variable)
    @@no_of_customers = 0

    def initialize(id, first_name, last_name)
        @id = id
        @first_name = first_name
        @last_name = last_name
        @@no_of_customers += 1
    end

    # all methods in this block are static
    class << self
        def total_customers() 
            @@no_of_customers
        end
    end

    # another way to declare a static method
    def self.get_total_customers()
        @@no_of_customers
    end
    
end


cust1 = Customer.new(1, "John", "Smith")
puts Customer.class_variable_get(:@@no_of_customers) # 1
cust1 = Customer.new(1, "Elon", "Musk")
puts Customer.class_variable_get(:@@no_of_customers) # 2


# using static methods to access it
puts Customer.get_total_customers() # 2
puts Customer.get_total_customers() # 2
# Other Programming Languages
# enum BugStatus { OPEN, CLOSED };
# BugStatus original_status = OPEN;
# BugStatus current_status  = CLOSED;


# Ruby
original_status = :open
current_status  = :closed

puts "Status = #{original_status}"
puts "Status = #{current_status}"


# We can change the contents of a string:
mystring = "Hello"
mystring[0] = ?h # "hello"
puts mystring


# But we can't change the contents of a symbol:
# :mysymbol[0]  = ?b # Raises an error
# puts :mysymbol



# Same string contents, different strings.
str_comparison = "open".object_id == "open".object_id
puts str_comparison # false

# Same symbol name, same object.
symbol_comparison = :open.object_id == :open.object_id
puts symbol_comparison # true
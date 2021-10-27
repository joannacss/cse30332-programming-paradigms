# Syntax: obj.send(message, args) or obj.message(args)
# Zero-argument messages
puts 5.send(:abs) 			# 5
puts 5.send('abs') 			# 5
puts 5.abs 					# 5
# A one-argument method
puts 5.send(:+, 3) 			# 8
puts 5.send('+', 3) 		# 8
puts 5.+(3) 				# 8
puts 5 + 3 					# 8
# Messages can be stored in variables
operator = '-'
puts 5.send(operator, 2) 	# 3

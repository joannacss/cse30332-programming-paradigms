# (params) -> body

sayHello = (name) -> return "Hello there, "+ name; 
greet = (name) => "Hello there, "+ name;
square = (x) -> Math.pow(x,2)

console.log(sayHello("Joanna"))
console.log(greet("Joanna"))
console.log(square(4))



squares = [1..5].map(square) # pass function by name
result = ((x) -> x * 5 ) 16  # call anonymous function



console.log(squares)
console.log(result)


anonymousFunction = (x) -> x * 5
result2 = anonymousFunction(16)
console.log(result2)
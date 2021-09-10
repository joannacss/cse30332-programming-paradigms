# Coffee Script Basics
# Example 1
square = (x) -> Math.pow(x,2)
squares = [1..5].map(square)  #pass function by name
result = ((x) -> x * 5) 16    #call anonymous function

console.log squares
console.log result

assert = require 'assert'
assert.deepStrictEqual(squares, [1,4,9,16,25])
assert result is 80

# Example 2
f = (x, y=1, z=0) -> x * y + z

console.log f(2)	#2+1+0=2
assert f(2) is 2

console.log f(3,5)	#3+5+0=15
assert f(3,5) is 15

# Example 3
circle =
    radius: 10,
    area: -> Math.PI * @radius * @radius
    circumference: -> 2 * Math.PI * @radius
	
assert = require 'assert'
assert circle.area() is 100 * Math.PI
assert circle.circumference() is 20 * Math.PI

# Example 4
person =
    name: 'Alice'
    tryToSayHelloButFail: (delay) ->
        setTimeout (() -> console.log "Hi from #{@name} :("), delay
    sayHello: (delay) ->
        setTimeout (() => console.log "Hi from #{@name} :)"),delay

person.tryToSayHelloButFail 1000 # Hi from undefined :(
person.sayHello 1000 #Hi from Alice :)
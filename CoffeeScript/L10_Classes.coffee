class Circle
	constructor: (@x=0, @y=0, @radius=1, @color='black') -> 
	area: -> Math.PI * @radius * @radius
	circumference: -> 2 * Math.PI * @radius
	expand: (scale) -> @radius *= scale
circles = [(new Circle 3, 5, 10, 'blue'), (new Circle)]
console.log circles
assert = require 'assert'
assert circles[0].color is 'blue'
assert circles[1].circumference() is 2 * Math.PI




class Animal
	constructor: (@name) ->
	speak: -> "#{@name} says #{@sound()}"
class Cow extends Animal
	sound: -> 'moooo'
class Horse extends Animal 
	sound: -> 'neigh'
class Sheep extends Animal 
	sound: -> 'baaaa'

assert = require 'assert'
h = new Horse 'CJ'
assert h.speak() is 'CJ says neigh'
c = new Cow 'Bessie'
assert c.speak() is 'Bessie says moooo'
assert new Sheep('Little Lamb').speak() is 'Little Lamb says baaaa'
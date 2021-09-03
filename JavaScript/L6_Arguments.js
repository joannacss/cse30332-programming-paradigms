// Arguments example
function f(x, y) { return [x, y] }
function g(x, ...y) { return [x, y] }
function h(x, y=0) { return [x, y] }
console.log(f(1))       // too few args, output is [1, undefined]
console.log(h(1))       // too few args, output is [1, 0]
console.log(f(1, 2, 3)) // too many args (3 is ignored)
console.log(g(1, 2, 3)) // args packed, output is [1, [2, 3]]
const args = [1, 2]
console.log(f(...args)) // args are unpacked, output is [1, 2]


// Passing by reference vs Passing by value
const x = [1,2,3];
const y = [4,5,6];
function f(a, b) {
	a = 300;
	console.log(x); // [1,2,3]
	b[1] = 400;
	console.log(y) // [4,400,6] --> see the change!
}

f(x, y);


// Closures = Example 1
const x = 'OUTER';
function second() {
	console.log(x);
}
function first() {
	const x = 'FIRST'; 
	second();
} 
first();

// Closures = Example 2
const x = 'OUTER';
function second(x) {
	console.log(x);
}
function first() {
	const x = 'FIRST'; 
	second(x);
} 
first();

// Closures = Example 3
function second(callbackFunction) {
	const name = 'new';
	callbackFunction();
}

function first() {
	const name = 'old';
	const printName = () => console.log(name);
	second3(printName);
}

first();


// Closure = Example 4
var passed = 3;

var addTo = function(){
	var inner = 2;
	return passed + inner;
}

console.log(addTo())

// A generator function
const nextSquare = (() => {
	let previous = -1;
	return () => {
		previous++;
		return previous*previous;
	}
})();




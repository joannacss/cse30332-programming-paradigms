let x = [1,2];
let y = x; // now y is pointing to x!!
y[0] = 3; // changing y also changes x
console.log(x); // prints [3,2]
console.log(y); // prints [3,2]
console.log(x === y) // true, they're pointing to the same array in the memory


let z = x.slice(); // creates a shallow copy!
z[0] = 4;
console.log(x); // prints [3,2]
console.log(z); // prints [4,2]
console.log(z === y) // false, they're NOT pointing to the same array in the memory
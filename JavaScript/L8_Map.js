const map1 = new Map();

map1.set('a', 1); // Map(1) { 'a' => 1 }
map1.set('b', 2); // Map(2) { 'a' => 1, 'b' => 2 }
map1.set('c', 3); // Map(3) { 'a' => 1, 'b' => 2, 'c' => 3 }

let val1 = map1.get('a'); // val1=1
map1.set('a', 97);
let val2 = map1.get('a'); // val2=97

console.log(map1.size); // 3
map1.delete('b');   
console.log(map1.size); // 2

/* Alternative 2 */
const map2 = {}; // objects are key-value pairs!

map2["a"] = 1; // map2 = { a: 1 }
map2["b"] = 2; // map2 = { a: 1, b: 2 }
map2["c"] = 3; // map2 = { a: 1, b: 2, c: 3 }

let val3 = map2['a']; // val3 = 1
map2.a = 97;
let val4 = map2['a']; // val4 = 97

console.log(Object.keys(map2).length); // 3
delete map2.b;  // or delete map2["b"];
console.log(Object.keys(map2).length); // 2
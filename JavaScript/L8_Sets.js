const set = new Set()

set.add(1)              // Set(1) { 1 }
set.add(1)              // Set(1) { 1 }
set.add('joanna')       // Set(2) { 1, 'joanna' }
let obj1 = {a: 1, b: 2}
set.add(obj1)           // Set(3) { 1, 'joanna', { a: 1, b: 2 } }
let obj2 = {a: 1, b: 2}
set.add(obj2)           // Set(4) { 1, 'joanna', { a: 1, b: 2 }, { a: 1, b: 2 } }
                        // o2 is referencing a different object 

set.has(1)              // true
set.has(3)              // false
set.has('Joanna'.toLowerCase()) // true
set.has(obj1)           // true

set.size                // 4

set.delete('joanna')    // removes 'joanna' from the set
set.has('joanna')       // false, value has been removed

set.size                // 3

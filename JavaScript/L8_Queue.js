const queue = [] // or new Array()
// adding elements
queue.push([0,0])       
queue.push([5,0])
queue.push([0,3])

queue.length // 3
// retrieving elements
let element = queue.shift() // [0,0]


// checking the size
queue.length // 2

// checking is empty
queue.length === 0 

// interesting behavior
// decreasing its length remove elements
queue.length = 0 // queue = [] 
// increasing its length add elements
queue.length = 1 // queue = [<1 empty item>]
let item = queue.shift() // item = undefined


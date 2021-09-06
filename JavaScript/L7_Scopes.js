let a1 = "Joanna"; // global
function first() {
    a2 = "Cecilia"; // global
    var a4 = "da Silva";
    if(a4 === "da Silva"){ 
        const a5 = "Santos";
        if(a2 === "Cecilia"){
            console.log(a5);        
        }
    }
    console.log(a1); // prints "Joanna"
    console.log(a2); // prints "Cecilia"
    console.log(a3); // prints "A constant"
    console.log(a4); // prints "A constant"
    console.log(a5); // ReferenceError: a5 is not defined
}
const a3 = "A constant"; // global
function second(x) {
    let b = 2; // local scoped
    // prints "Joanna 2"
    console.log(a1 + ' ' + b);
    if (b > 0) {
        let c = 'hello'; // block scoped
        // prints "Joanna 2 hello"
        console.log(a1 + ' ' + b + ' ' + c);
    }
    // prints the value passed to x
    console.log(x); 
    // ReferenceError: c is not defined
    console.log(a1 + ' ' + b + ' ' + c); 
}

// Un-Comment the lines below to see what happens
first()
// second("Value for x")

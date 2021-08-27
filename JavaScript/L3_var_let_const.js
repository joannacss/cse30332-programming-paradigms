/* EXAMPLE WITH VAR */
var name = 'Joanna';

function greetUser() {
  var name = 'Cecilia';
  console.log(`Welcome back, ${name}.`); // Cecilia
}

console.log(`Outside the function ${name}`); // Joanna
greetUser();




/* EXAMPLE WITH VAR */
let hello = "Joanna";
function greetings() {
  let hello = 'Cecilia!';
  console.log(`Hello ${hello}`); // Hello Cecilia
}
greetings(); 

console.log(hello); // Joanna

let hello = "Silva"; // SyntaxError: Identifier 'hello' has already been declared


/* EXAMPLE WITH CONST */
const hello = "Joanna";
function greetings() {
  const hello = 'Cecilia!';
  console.log(`Hello ${hello}`); // Hello Cecilia
}
greetings(); 
console.log(hello); // Joanna
hello = "Silva"; // SyntaxError: Identifier 'hello' has already been declared

/* EXAMPLE VAR VS LET */
function comparison(n){
  if( n > 0){
    var result = "Positive";
  }else if( n == 0){
    var result = "Zero";
  }else{
    let result = "Negative";
  }
  return result;
}

console.log(comparison(1));
console.log(comparison(0));
console.log(comparison(-1));

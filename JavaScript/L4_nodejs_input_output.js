/* I/O Example*/
const readlineModule = require('readline');

const rl = readlineModule.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("What's your name? ", (answer) => {
  console.log(`Hi ${answer}`); /* keeps waiting until close is invoked */
  rl.close();
});



/* Arrow Function Expression Example */
const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
})
readline.question(`How old are you?`, (age) => {
  let welcome = (age < 21) ?
  () => console.log("Sorry, I can't serve you a drink") :
  () => console.log("What would you like to drink?");
  welcome();
  readline.close();
})
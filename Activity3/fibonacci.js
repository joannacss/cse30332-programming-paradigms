/**
 * Version 1: Using two auxiliary variables
 */
function fibLoop1(n) {
  if (n === 0) return 0;
  if (n === 1) return 1;
  let total2 = 0;
  let total1 = 1;
  for (let i = 2; i <= n; i++) {
    let temp = total2;
    total2 = total1;
    total1 = total1 + temp;
  }
  return total1;
}

for(let i=0; i< 20; i++){
	console.log(fibLoop1(i));	
}



/**
 * Version 2: Using an array
 */
function fibLoop2(n) {
  var fib = [0, 1];
  for (var i = 2; i <= n; i++) {
    fib[i] = fib[i-1] + fib[i-2];
  }
  return fib[n];
}

for(let i=0; i< 20; i++){
	console.log(fibLoop2(i));	
}
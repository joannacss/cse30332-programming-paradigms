/**
 * A very long operation that eventually returns a random integer number from 0-10
 */ 
function aVeryLongOperation() {
	let nIterations = 60;
	for(let i = 0; i < nIterations ; i++){
		for(let j = 0; j < nIterations ; j++){
			for(let k = 0; k < nIterations ; k++){
				for(let x = 0; x < nIterations ; x++){
					for(let y = 0; y < nIterations ; y++){
						let noop = () => {};
					}
				}
			}
		}
	}
	let randomInteger = Math.floor(Math.random() * 10);
	return randomInteger; 
}

// Look how long this code takes
var t0 = performance.now();
let randomInt = aVeryLongOperation();
console.log("Random number " + randomInt);
var t1 = performance.now();
console.log("Call to aVeryLongOperation() took " + (t1 - t0)/1000 + " seconds.")
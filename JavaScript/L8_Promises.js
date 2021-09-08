function aVeryLongOperationWithPromises(resolve, reject) {
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
	resolve(randomInteger); 
}


let randomIntPromise = new Promise(aVeryLongOperationWithPromises);


var t0 = performance.now();
const onFulfilled = (randomInt) => console.log("Random number " + randomInt);
randomIntPromise.then(onFulfilled);
var t1 = performance.now();
console.log("Call to randomIntPromise.then(...) took " + (t1 - t0)/1000 + " seconds.")





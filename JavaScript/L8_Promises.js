/**
 * A very long operation that eventually generates a random integer number from 0-10
 */ 
function aVeryLongOperationWithPromises(resolve, reject) {
	const generateRandomNum = () => {
		let randomInt = Math.floor(Math.random() * 10);
		resolve(randomInt);
	};
	setTimeout(generateRandomNum, 500);	
}

let randomIntPromise = new Promise(aVeryLongOperationWithPromises);
const onFulfilled = (randomInt) => console.log("Random number " + randomInt); 
randomIntPromise.then(onFulfilled);

/**
 * A very long operation that eventually generates a random integer number from 0-10
 */ 
function aVeryLongOperation() {
	const generateRandomNum = () => {
		let randomInt = Math.floor(Math.random() * 10);
		console.log("Random number " + randomInt); 
	};
	setTimeout(generateRandomNum, 500);	
}

aVeryLongOperation();

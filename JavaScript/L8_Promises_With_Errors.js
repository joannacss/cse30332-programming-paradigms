let TICKET_AMOUNT = 5;

function payToll(resolve, reject) {
    const generateRandomNum = () => {
        let randomPaidAmount = Math.floor(Math.random() * 10);
        
        if(randomPaidAmount === TICKET_AMOUNT)
            resolve(randomPaidAmount);
        else 
            reject(randomPaidAmount);
    };
    setTimeout(generateRandomNum, 500);    
}

let payTollPromise = new Promise(payToll);
const onFulfilled = (randomInt) => console.log("Ticket is paid! Paid amount = " + randomInt);
const onRejected  = (randomInt) => console.log("Ticket is not paid! Paid amount = " + randomInt)
payTollPromise.then(onFulfilled, onRejected)

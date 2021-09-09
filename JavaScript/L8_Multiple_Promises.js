function aVeryLongOperationWithPromises(resolve, reject) {
    setTimeout(() => resolve(Math.floor(Math.random() * 10)), 500);    
}
new Promise(aVeryLongOperationWithPromises)
    .then(value => { 
        console.log("THEN #1"); 
        return value + ' and bar'; 
    })
    .then(value => { 
        console.log("THEN #2"); 
        return value + ' and bar again'; 
    })
    .then(value => { 
        console.log("THEN #3");
        return value + ' and again'; 
    })
    .then(value => {
        console.log("THEN #4");
        return value + ' and again'; 
    })
    .then(value => { 
        console.log("THEN #5");
        console.log("Random Number="+value) 
    })
    .catch(err => { 
        console.log(err) 
    });

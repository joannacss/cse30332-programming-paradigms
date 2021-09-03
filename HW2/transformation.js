// Version 1: Declarative

function isAllElementsBelowThresholdDecl(values, threshold){
    const isBelowThreshold = (currentValue) => currentValue < threshold;
    return values.every(isBelowThreshold);
}

function isAllElementsBelowThresholdImp(values, threshold){
    for(let i = 0; i < values.length ; i++){
        if(values[i] >= threshold)
            return false;
    }
    return true;
}

console.log(isAllElementsBelowThresholdDecl([1, 30, 39, 29, 10, 13], 40));
console.log(isAllElementsBelowThresholdImp([1, 30, 39, 29, 10, 13], 40));
console.log(isAllElementsBelowThresholdDecl([1, 30, 40, 29, 10, 13], 40));
console.log(isAllElementsBelowThresholdImp([1, 30, 40, 29, 10, 13], 40));

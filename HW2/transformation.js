function isAllElementsBelowThreshold(values, threshold){
    const isBelowThreshold = (currentValue) => currentValue < threshold;
    return values.every(isBelowThreshold);
}

// function isAllElementsBelowThreshold(values, threshold){
//     for(let i = 0; i < values.length ; i++){
//         if(values[i] >= threshold)
//             return false;
//     }
//     return true;
// }

console.log(isAllElementsBelowThreshold([1, 30, 39, 29, 10, 13], 40));
console.log(isAllElementsBelowThreshold([1, 30, 40, 29, 10, 13], 40));

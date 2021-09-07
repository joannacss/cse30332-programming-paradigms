/* EXAMPLE */

// Example: Imperative
function isAllElementsBelowThreshold(values, threshold){
    const isBelowThreshold = (currentValue) => currentValue < threshold;
    return values.every(isBelowThreshold);
}

// Example: Converted to Declarative
function isAllElementsBelowThreshold(values, threshold){
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

/* FUNCTIONS TO BE CONVERTED */

// Function 1
var users = [
    {name: "Marta", id: 1}, {name: "Josh", id: 2},
    {name: "Achilles", id: 3}, {name: "Julius", id: 4},
]
function findUserById(id){
    for(let i = 0; i < users.length; i++){
        if(users[i].id == id)
            return users[i].name;
    }
    return null;
}
console.log(findUserById(4));
console.log(findUserByName(20));


var people = [
    {name: "Marta", height: 1.74, weight: 59}, {name: "Josh", height: 1.80, weight: 88},
    {name: "Achilles", height: 1.68, weight: 63}, {name: "Julius", height: 1.93, weight: 97},
];

function computeBMIs(){
    var bmiArray = [];
    for(let i = 0; i < people.length; i++){
        let bmi = people[i].weight/(people[i].height*people[i].height);
        bmiArray.push(bmi);
    }
    return bmiArray;
}

console.log(computeBMIs());





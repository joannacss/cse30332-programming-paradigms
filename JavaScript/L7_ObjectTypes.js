function Bottle(capacity, currentAmount){
  this.capacity = capacity;
  this.currentAmount = currentAmount;
  this.nextStates = [];
}

Bottle.prototype.computeNextStates = function() {
  /* … */
}
Bottle.prototype.toString = function() {
  if(this.currentAmount === this.capacity) return "FULL";
  if(this.currentAmount === 0) return "EMPTY";
  return "PARTIALLY FILLED ("+ this.currentAmount + ")";
}

class Bottle{
  constructor(capacity, currentAmount){
    this.capacity = capacity;
    this.currentAmount = currentAmount;
    this.nextStates = [];
  }

  computeNextStates() {
    /* … */
  } 
  toString() {
    if(this.currentAmount === this.capacity) return "FULL";
    if(this.currentAmount === 0) return "EMPTY";
    return "PARTIALLY FILLED ("+ this.currentAmount + ")";
  }
}


let b1 = new Bottle(5,0);
console.log("Bottle is " + b1)
let b2 = new Bottle(3,3);
console.log("Bottle is " + b2)
let b3 = new Bottle(5,3);
console.log("Bottle is " + b3)


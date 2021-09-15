var assert = require('assert');
var brokenFib = require('./brokenFibonacci')
describe('fibonacci(n)', function() {
  it('should return 0 when the value is 0', function() {
    console.log(brokenFib.fibonacci(0));
    assert.equal(brokenFib.fibonacci(0), 0);
  });
  it('should return 1 when the value is 1', function() {
    assert.equal(brokenFib.fibonacci(1), 1);
  });
});  

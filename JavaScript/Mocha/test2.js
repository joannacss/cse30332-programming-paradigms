function fibLoop2(n) {
  var fib = [0, 1];
  for (var i = 2; i <= n; i++) {
    fib[i] = fib[i-1] + fib[i-2];
  }
  return fib[n];
}

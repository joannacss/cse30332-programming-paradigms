var set = new Set();

var array = [1, 2];
set.add(array);
set.has(array); // true 👍


// One thing to highlight: everytime you create an array, it is a *different* object
// Thus, although the arrays below have the same values in it they're still considered as **different** objects
set.add([5, 3]);
set.has([5, 3]); // false 🤯

// How to adapt to our problem?
// trick: conver the array to a string!!!!
// remember the toString() method we saw in Lecture 7?
set.add([3, 0].toString())
set.has([3, 0].toString()) // true 👍

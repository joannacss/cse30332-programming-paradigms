//  Pseudocode below from Wikipedia (https://en.wikipedia.org/wiki/Breadth-first_search)
//  1  procedure BFS(G, root) is
//  2      let Q be a queue
//  3      label root as explored
//  4      Q.enqueue(root)
//  5      while Q is not empty do
//  6          v := Q.dequeue()
//  7          if v is the goal then
//  8              return v
//  9          for all edges from v to w in G.adjacentEdges(v) do
// 10              if w is not labeled as explored then
// 11                  label w as explored
// 12                  Q.enqueue(w)



/**
 * Placeholder function that verifies whether it is the target goal.
 * For this example, I am considering the target amount = 2
 */
function isGoal(state) {
    return (state[0] === 2 && state[1] === 0) ||
        (state[1] === 2 && state[0] === 0);
}
/**
 * Search WITHOUT tracking the path
 */
function breadthFirstSearch(graph) {
    let rootState = [0, 0]
    let queue = [rootState]
    let visited = new Set()

    while (queue.length > 0) {
        let currentState = queue.shift();
        // state has not been visited yet
        if (!visited.has(currentState.toString())) {
            visited.add(currentState.toString()); // mark state as visited
            if (isGoal(currentState)) {
                return currentState;
            }
            var nextStates = graph[currentState.toString()]
            nextStates.forEach(x => queue.push(x));
        }
    }
    return -1;
}

/**
 * Search which tracks the path
 */
function breadthFirstSearch2(graph) {
    let rootState = [0, 0]
    let queue = [ [[], rootState] ]
    let visited = new Set()

    while (queue.length > 0) {
        let currentArray = queue.shift();
        let currentState = currentArray[1]
        let currentPath = currentArray[0].concat([currentState])

        if (!visited.has(currentState.toString())) {
            if (isGoal(currentState)) {
                return currentPath;
            }
            var nextStates = graph[currentState.toString()]
            nextStates.forEach(x => queue.push([currentPath, x]));
        }
    }
    return -1;
}

/* 
    keys = states; values = list of next states 
    this is for illustration purposes, and the graph is not 100% complete 
    (i.e., it does not have all possible states)
*/
let bottlesGraph = {
    '0,0':[[5,0],[0,3]],
    '5,0':[[0,0],[0,3],[2,3]],
    '0,3':[[0,0],[5,3],[3,0]],
    '2,3':[[0,3],[2,0],[5,0]],
    '5,3':[[0,3],[5,0]],
    '3,0':[[0,0],[3,3]],
    '3,3':[[3,0],[0,3],[5,1]]
};

// Compare the outputs below: 
//  - one only returns the target goal state
//  - the other returns all the steps taken to reach the goal state

var solution = breadthFirstSearch2(bottlesGraph);
console.log("Solution ", solution);

var targetGoal = breadthFirstSearch(bottlesGraph);
console.log("Target goal ", targetGoal);
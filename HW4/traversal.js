class Node{
	constructor(value, nextNodes){
		this.value = value;
		this.nextNodes = nextNodes;
	}
}


function traverseTree(root){
	visitedNodes = [12,22,4,25,1,5]
	/* ... logic in here */

	return visitedNodes; 
}




root = new Node(12,[
		new Node(22, [new Node(1,[]),new Node(5,[])]),
		new Node(4, []),
		new Node(25, []),
	])




let visited = traverseTree(root);
console.log(visited)
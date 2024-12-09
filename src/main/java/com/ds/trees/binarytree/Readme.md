#### Introduction
___

#### What is a tree?
___
A data structure that consists of nodes in a parent/child relationship

___
- List are linear i.e they can only have one child or reference
- Trees are non-linear i.e they can have multiple children/paths
- Singly linked list can be seen as a linear tree
- In a Tree -  a node can only point to its direct child and not pointing to neighbouring nodes
- A Tree must have a single beginning
- There must be an entry point within a tree
___

#### Tree Terminology
- Root: The top node in a tree
- Child: A node directly connected to another node when moving away from the root
- Parent: Is the starting point of another node which are referred to child.
- Siblings: A group of nodes with the same parent
- Leaf: A node with no children i.e the ending node within a Tree can be said to be a leaf as it often times have no children
- Edge: The connection between one node and another node

___

#### Implementation of a tree
- HTML DOM i.e it implemented each child of a node in a parent child relationship. i.e you have an element, inside the element you have children that are directly linked to the element and so on
- Network routing
- Abstract syntax tree i.e a way of explaining the structure of a programming language structure
- Used in AI e.g decision trees within an AI in the building of a tictac game
- Folders in Operating systems
- Computer File Systems
- JSON - Javascript object notations

#### Types of Trees
- Binary Trees - Each node can have at most 2 children i.e a node can have 0 or more but must be 2 at most
- Binary Search Trees - It is used to store data that can be compared. 
  - Special case of a binary trees but sorted in a particular way. It is implemented in a way that all the children to the left are less than the node while all at the right hand are greater than the node
  - Every node to the left are smaller than the parent
  - every node to the right is greater than the parent
- Ternary Trees - Each node can have at most 3 children


#### Binary Tree
This ensures we have just two children within a node but they are not in any order.
Search for a value is very difficult and has to mean that all nodes has to be visited.
It is also called ordered or sorted binary trees

#### Binary Search Tree
- It is used to optimise the searching process of elements within a Tree
#### Two Ways of Traversing A Tree
 - The question is how do we visit all the node one time?
    - #### Breadth First Search (visiting the sibling of a node before going to the child) This internally use the implementation of a queue
      - Starting the search from the beginning and working across the tree from left node to the right node.
    - ##### Depth First Search 
      - Three main order (going down vertically) they are either In Order, PreOrder and PostOrder
- - PreOrder
  - This involves visiting the node first then the left of the node and then the right of the node
  - 
- - Post
  - Visit the node after visiting the sibling

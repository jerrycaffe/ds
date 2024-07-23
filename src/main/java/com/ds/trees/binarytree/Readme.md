#### Introduction
___

#### What is a tree?
___
A data structure that consists of nodes in a parent/child relationship

___
- List are linear i.e they can only have one child or reference
- Trees are non linear i.e they can multiple children/paths
- Node can only point to a child and if that happens then it cannot be considered a tree
- There must be an entry point within a tree
___

#### Tree Terminology
- Root: The top node in a tree
- Child: A node directly connected to another node when moving away from the root
- Parent: The converse notion of a child
- Siblings: Agroup of nodes with the same parent
- Leaf: A node with no children
- Edge: The connection between one node and another node

___

#### Implementation of a tree
- HTML DOM i.e it implemented each child of a node in a parent child relationship
- Network routing
- Abstract syntax tree i.e a way of explaining the structure of a programming language structure
- Used in AI e.g decision trees within an AI
- Folders in Operating systems
- Computer File Systems
- JSON - Javascript object notations

#### Types of Trees
- Binary Trees - Each node can have at most 2 children i.e a node can have 0 or more but must be 2 at most
- Binary Search Trees - Special case of a binary trees but sorted in a particular way. It is implemented in a way that all the children to the left are less than the node while all at the right hand are greater than the node

#### Binary Tree
This ensures we have just two children within a node but they are not in any order.
Search for a value is very difficult and has to mean that all nodes has to be visited

#### Two Ways of Traversing A Tree
- breadth First Search: Starting the search from the beginning and working across the tree from left to right
- Depth First Search: Three main order: going down vertically they are either In Order, PreOrder and PostOrder
- - Post

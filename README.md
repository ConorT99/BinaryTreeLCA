# Sweng

This project was split into two sections:
  - To create a program and tests in the language of our choice which would be able to determine the Lowest Common Ancestor of 
    any two nodes in a Binary Tree.
  - To create a branch from this program and in it, extend the program so that it could also allow a user to find the Lowest
    Common Ancestor of two nodes in a Directed Acyclic Graph (DAG). This branch was then to be merged with master.
    
This project was completed in Java, with JUnit being the testing framework used to ensure ample code coverage for the purposes
of this assignment.

# Constraints Placed Upon Solution

- The implementation provided in this repo can only return the Lowest Common Ancestor for two nodes. These nodes can be the
  same
  
# Relevant Definitions

- "In graph theory and computer science, the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic
  graph (DAG) T is the lowest (i.e. deepest) node that has both v and w as descendants, where we define each node to be a 
  descendant of itself (so if v has a direct connection from w, w is the lowest common ancestor)." - Wikipedia
  https://en.wikipedia.org/wiki/Lowest_common_ancestor
  
# Most Recent Commits for both parts of the Assignment

Part 1 (LCA for a Binary Tree): This part can only be found on its own at commit 
00d60182de424855335efbf63430b1086ea9f00d as the branch which implemented the LCA for a DAG was merged back into
master.

Part 2 (LCA for a DAG): This part can either be found in Sweng/src/btLCA or else at commit
ccc1e9fb2e3275a899ef4974451e5acd296638a8

Part 3 (Biography of Engineer): The link to the biography can be found in Sweng/Biography or else at commit
65691750ec93aecb9fab5d51e7115c66a93eee77

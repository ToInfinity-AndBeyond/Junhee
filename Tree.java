public class Tree {
    
}


// Binary Search Tree: 이진 탐색 트리는 각 노드가 최대 두 개의 자식 노드를 가지는 트리 자료구조입니다.
// BST는 데이터를 정리해서 겁색, 삽입, 삭제를 빠르게 하기 위한 트리 구조.
// 부모보다 작은 값 --> 왼쪽
// 부모보다 큰 값 --> 오른쪽

/*

          10
         /  \
        5    15
       / \     \
      3   7     20
           \ 
            8

 */

// Sketch the resulting binary tree when the following items are entered: 10, 15, 3, 12, 7, 1, 22, 18, 5

/*
              10
             /  \
            3    15
          / \    / \
         1   7  12 22
             /     /
            5     18
 */

// Node search: To search for a value in a BST, you start at the root and compare the target value with the current node's value.

// Node traversal: 항상 left는 right보다 먼저 방문. 
// In-order (left, root, right), Pre-order (root, left, right), Post-order (left, right, root)

// In order: 1, 3, 5, 7, 10, 12, 15, 18, 22

// Pre order: 10, 3, 1, 7, 5, 15, 12, 22, 18

// Post order: 1, 5, 7, 3, 12, 18, 22, 15, 10


// Node deletion: To delete a node from a BST, you need to consider three cases:
// 1. Node to be deleted is a leaf node (no children): Simply remove the node from the tree.
// 2. Node to be deleted has one child: Replace the node with its child.
// 3. Node to be deleted has two children: Find the in-order successor (the smallest node 
// in the right subtree) or the in-order predecessor (the largest node in the left subtree) 
// to replace the node, and then delete the in-order successor or predecessor 
// from its original position

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null; // left child is initially null
        this.right = null; // right child is initially null
    }
}
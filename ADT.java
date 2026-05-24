public class ADT {
    
}

// ADt: Abstract Data Type, 데이터와 그 데이터를 처리하는 연산을 하나의 단위로 묶은 것.
// ADT is a data structure describedc by what it does, not exaclty how it is implemented. 
// 예시: Stack, Queue, Linked List, Tree, Graph 등

// An ADT focuses on the operations available to user. 
// Add item, remove item, search item, display item, check if empty, check size, etc.

// The user does not need to know how the ADT is implemented, just how to use it.

// Interface: ADT의 일종, 클래스가 구현해야 하는 메서드의 집합을 정의. (insert, delete, search) --> 무엇을 할 수 있어?
// Implementation: ADT의 구체적인 구현, 실제로 데이터를 저장하고 조작하는 방법을 정의. (Array, Linked List, Hash Table) --> 그걸 어떻게 할 수 있어?

// Abstraction means hiding the complex implementation details and showing only the 
// necessary features of an object. --> add() method is an abstraction, we don't care how it works, 
// just that it adds an item to the collection. 

// Encapsulation means bundling the data and methods that operate on the data within 
// a single unit (class) and restricting access to some of the object's components. 

// Modularity means breaking a compelx system into smaller, manageable, and independent modules. 
// Each module should have a specific responsibility and can be 
// developed, tested, and maintained independently.

// Linked List is a data structure made of nodes, and each node contains 
// data and pointer (reference to the next node).

// Ex) head (start) --> 10 --> 8 --> 5 --> null (end)


class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(int data) {
        this.data = data;
        this.next = null; // next node is initially null
        this.prev = null; // previous node is initially null
    }
}

// Advantages of Linked List:
// 1. Dynamic size: Linked List can grow and shrink in size during runtime, while arrays have a fixed size.


// 2. Ease of insertion/deletion: Inserting or deleting elements in a Linked List is easier than in an array, as it does not require shifting elements.

// 3. Flexible memory usage: Linked List can utilize memory more efficiently, as it does not require contiguous memory allocation like arrays.

// Disadvantages of Linked List:
// 1. Memory overhead: Each node in a Linked List requires extra memory for storing the reference to the next node, which can lead to increased memory usage compared to arrays.
// 2. Sequential access: Linked List does not support random access, meaning that to access an element, you must traverse the list from the head node, which can be inefficient for large lists.


// Types of Linked Lists:
// 1. Singly Linked list: Each node has a reference to the next node only. Ex) head --> 10 --> 8 --> 5 --> null
// 2. Doubly Linked List: Each node has references to both the next and previous nodes. Ex) head <--> 10 <--> 8 <--> 5 <--> null
// Advantages of Doubly Linked List: Traversal in both directions, easier deletion of nodes, more flexible insertion.
// Disadvantages of Doubly Linked List: More memory usage due to extra reference, more complex
// 3. Circular Linked List: The last node points back to the head node, creating a circular structure. Ex) head --> 10 --> 8 --> 5 --> head

// Linked List Operations
// 1. Traversal / Search: To traverse a Linked List, you start from the head node and follow the next references until you reach the end (null). 
// To search for an element, you can compare each node's data with the target value during traversal.
// 1.1 Start at the head node; check the current node; follow the pointer to the next node; repeat until you find the target or reach NULL
// Ex) 1 --> 3 --> 4 --> 5  --> null
// 2. Insertion - insert at the begining, insert at the end, insert at a specific position
// 2.1 Insert at the beginning: Create a new node; Set the new node's next reference to the current head; Update the head reference to point to the new node.
// 2.2 Insert at the end: Create a new node; Traverse the list to find the last node; Set the last node's next reference to the new node.
// 2.3 Insert at a specific position: Create a new node; Traverse the list to find the node after which the new node will be inserted; Set the new node's next reference


// Deletion - delete from the beginning, delete from the end, delete from a specific position
// 3.1 Delete from the beginning: Update the head reference to point to the second node; The original head node will be garbage collected if there are no other references to it.
// 3.2 Delete from the end: Traverse the list to find the second-to-last node; Set the second-to-last node's next reference to null; The original last node will be garbage collected
// 3.3 Delete from a specific position: Traverse the list to find the node before the one to be deleted; Set the previous node's next reference to point to the node after the one being deleted; The original node will be garbage collected   

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // next node is initially null
    }
}

class MyLinkedList {
    Node head; // head of the linked list

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // move to the next node
        }

        System.out.println("null");
    }

    boolean search(int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next; // move to the next node
        }
        return false; // target not found in the list
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode; // set the last node's next reference to the new node
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // set the new node's next reference to the current head
        head = newNode; // update the head reference to point to the new node
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            if (current ==null) {
                throw new IllegalArgumentException("Position out of bounds");
            }

            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteFromBeginning() {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        head = head.next; // update the head reference to point to the second node
    }

    void deleteFromEnd() {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        if (head.next == null) {
            head = null; // List has only one node, set head to null
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next; // move to the second-to-last node
        }

        current.next = null; // set the second-to-last node's next reference to null
    }

    void deleteFromPosition(int position) {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        if (position == 0) {
            head = head.next; // update the head reference to point to the second node
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                throw new IllegalArgumentException("Position out of bounds");
            }
            current = current.next; // move to the node before the one to be deleted
        }

        if (current.next == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }

        current.next = current.next.next; // set the previous node's next reference to point to the node after the one being deleted
    }
}
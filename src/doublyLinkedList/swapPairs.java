package doublyLinkedList;

public class swapPairs {
	   private Node head;
	    private Node tail;
	    private int length;

	    class Node {
	        int value;
	        Node next;
	        Node prev;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public swapPairs(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        tail = newNode;
	        length = 1;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public Node getTail() {
	        return tail;
	    }

	    public int getLength() {
	        return length;
	    }

	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	    public void printAll() {
	        if (length == 0) {
	            System.out.println("Head: null");
	            System.out.println("Tail: null");
	        } else {
	            System.out.println("Head: " + head.value);
	            System.out.println("Tail: " + tail.value);
	        }
	        System.out.println("Length:" + length);
	        System.out.println("\nDoubly Linked List:");
	        if (length == 0) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
	        tail = null;
	        length = 0;
	    }
	    
	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (length == 0) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	        length++;
	    }

	    // WRITE THE SWAPPAIRS METHOD HERE // 
	    //                                 //
	    //                                 //
	    //                                 //
	    //                                 //
	    /////////////////////////////////////
	   public void swapPairs() {
	    // Create a dummy node to keep track of the new head
	    Node dummy = new Node(0);
	    dummy.next = head;
	    Node prev = dummy;
	 
	    // Iterate through the list while there are
	    // at least two nodes left to swap
	    while (head != null && head.next != null) {
	        // Identify the two nodes to be swapped
	        Node firstNode = head;
	        Node secondNode = head.next;
	 
	        // Swap the nodes and update connections
	        prev.next = secondNode;
	        firstNode.next = secondNode.next;
	        secondNode.next = firstNode;
	 
	        // Update prev pointers for the doubly linked list
	        secondNode.prev = prev;
	        firstNode.prev = secondNode;
	        if (firstNode.next != null) {
	            firstNode.next.prev = firstNode;
	        }
	 
	        // Move to the next pair in the list
	        head = firstNode.next;
	        prev = firstNode;
	    }
	 
	    // Update the head of the list to the new head
	    head = dummy.next;
	}
}

package linkedList;

public class reverseBetween {
	 private Node head;
	    private int length;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public reverseBetween(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        length = 1;
	    }

	    public Node getHead() {
	        return head;
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
	        } else {
	            System.out.println("Head: " + head.value);
	        }
	        System.out.println("Length:" + length);
	        System.out.println("\nLinked List:");
	        if (length == 0) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
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
	        }
	        length++;
	    }

	    // WRITE THE REVERSEBETWEEN METHOD HERE //
	    //                                      //
	    //                                      //
	    //                                      //
	    //                                      //
	    //////////////////////////////////////////
	    public void reverseBetween(int m, int n) {
	        // Return if the linked list is empty
	        if (head == null) return;
	     
	        // Create a dummy node and connect it to head
	        Node dummy = new Node(0);
	        dummy.next = head;
	        Node prev = dummy;
	     
	        // Move prev to the node before sublist start
	        for (int i = 0; i < m; i++) {
	            prev = prev.next;
	        }
	     
	        // Initialize current to the first node in sublist
	        Node current = prev.next;
	     
	        // Reverse the sublist
	        for (int i = 0; i < n - m; i++) {
	            // Initialize temp to the next node in sublist
	            Node temp = current.next;
	            // Skip temp in the original sublist order
	            current.next = temp.next;
	            // Reverse the order of temp and current
	            temp.next = prev.next;
	            // Update prev's next to maintain reversed order
	            prev.next = temp;
	        }
	     
	        // Update the head of the entire linked list
	        head = dummy.next;
	    }
}

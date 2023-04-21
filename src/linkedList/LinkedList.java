package linkedList;

import java.awt.HeadlessException;

public class LinkedList {

	public class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private Node head;
    private Node tail;
    private int length;
    
    public LinkedList(int value) {
    	Node newNode = new Node(value);
    	head = newNode;
    	tail = newNode;
    	length = 1;
    }
    public boolean isEmpty() {
    	if (head == null) return true;
    	return false;
    }
    public void printList(){
    	Node temp = head;
    	 while(temp !=null) {
    		System.out.println(temp.value);
    		temp = temp.next;
    	}
    }
    
    public void getTail() {
    	System.out.println("Tail: " + tail.value);
    }
    
    public void getHead() {
    	System.out.println("Head: " + head.value);
    }
    
    public void getLength() {
    	System.out.println("Length: " + length);
    }
    
    public void append(int value) {
    	Node newNode = new Node(value);
    	
    	if(isEmpty()) {
    		head = tail = newNode;
    	}else {
    		
    		tail.next = newNode;
    		tail = newNode;
    	}
    	length ++;
    }
    
    public void prepend(int value) {
    	Node newNode = new Node(value);
    	if(isEmpty()){ 
    		head = tail = newNode;
    	}else {
    	
    	newNode.next= head;
    	head = newNode;;
    	}
    	length++;
    }
    
    public Node removeLast() {
    	if(isEmpty()) return null;
    
    	Node temp = head;
    	Node pre = head;
    	
    	while(temp.next != null) {
    		pre = temp;
    		temp = temp.next;
    	}
    	tail = pre;
    	tail.next = null;
    	length --;
    	if(length == 0) head = tail = null;
    	return temp;
    	
    }
    
    public Node removeFirst() {
    	if(isEmpty()) return null;
    	Node temp = head;
        head = head.next;
        temp.next = null;
        length --;
        if(length == 0) {
        	tail = null;
    	}
        return temp;
    }
    
    public Node get(int index) {
    	if(index >= length || isEmpty()) return null;
    	
    	Node temp = head;
    	for (int i =0;i < index;i++) {
    		temp = temp.next;
    	}
    	return temp;
    }
    
    public boolean set(int index, int value) {
    	Node temp = get(index);
    	
    	if (temp != null) {
    	temp.value = value;
    	return true;
    	}
    	return false;
    	
    }
    
    public boolean insert(int index, int value) {
    	if(index > length || isEmpty()) return false;
    	if(index == 0) {
    		prepend(value);
    		return true;
    	}
    	if (index == length) {
    		append(value);
    		return true;
    	}
    	Node newNode = new Node(value);
    	Node temp = get(index -1);
    	newNode.next= temp.next;
    	temp.next = newNode;
    	length ++;
    	return true;
    }
    
    public Node remove(int index) {
    	if(index >= length || isEmpty()) return null;
    	if(index == 0) return removeFirst();
    	if(index == length-1) return removeLast();
    	
    	Node temp = get(index -1);
    	Node remove = temp.next;
    	temp.next = remove.next;
    	remove.next = null;
    	length --;
    	return remove;
    	
    }
    
    public void reverse() {
    	if(isEmpty() || length == 1) return;
        Node temp = head;
        head = tail;
        tail = temp; 
        Node after =temp.next;
        Node before = null;
        for(int i = 0; i < length; i++) {
        	after = temp.next;
        	temp.next = before;
        	before = temp;
        	temp = after;
        }
    	
    }
}

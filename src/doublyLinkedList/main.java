package doublyLinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLinkedList doubleList = new doublyLinkedList(5);
		doubleList.getHead();
		doubleList.getTail();
		doubleList.getLength();
		doubleList.printList();
		doubleList.append(69);
		doubleList.append(75);
		doubleList.prepend(88);
		
//		doubleList.getHead();
//		doubleList.getTail();
//		doubleList.getLength();
//		doubleList.printList();
//		System.out.println(doubleList.removeLast().value);
//		doubleList.printList();
//		System.out.println(doubleList.removeLast().value);
//		doubleList.printList();
//		System.out.println(doubleList.removeLast().value);
//		doubleList.printList();
//		System.out.println(doubleList.removeFirst().value);
//		System.out.println(doubleList.removeFirst().value);
//		System.out.println(doubleList.removeFirst().value);
//		System.out.println(doubleList.removeFirst().value);
		System.out.println(doubleList.get(1).value);
		System.out.println(doubleList.set(2,999));
		doubleList.printList();
		System.out.println();
		doubleList.insert(0,1000);
		doubleList.printList();
		doubleList.remove(2);
		System.out.println();
		doubleList.printList();
	}

}

package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList newList = new LinkedList(99);
//		newList.printList();
//		newList.getHead();
//		newList.getTail();
//		newList.getLength();
		newList.append(55);
		newList.prepend(777);
		
//		newList.printList();
//		newList.removeFirst();
//		newList.printList();
//		newList.removeFirst();
//		newList.printList();
//		newList.removeFirst();
//		newList.printList();
//		
//		System.out.println(newList.get(2).value);
//		newList.set(2,800);
//		newList.printList();
//		newList.set(0,100000);
//		newList.printList();
//
//		newList.insert(2,500000);
//		newList.printList();
//		System.out.println();
//		newList.remove(2);
//		newList.printList();
//		System.out.println();
//		newList.reverse();
//		newList.printList();
//		
//		hasLoopAlgo newlists = new hasLoopAlgo(99);
//		System.out.println(newlists.hasLoop());
		
		
		
		
		removeDuplicateUsingSet hasDuplicate = new removeDuplicateUsingSet(99);
		hasDuplicate.append(55);
		hasDuplicate.append(85);
		hasDuplicate.append(5);
		hasDuplicate.append(55);
		hasDuplicate.printAll();
		System.out.println();
		hasDuplicate.removeDuplicates();
		hasDuplicate.printAll();
		System.out.println(hasDuplicate.getTail().value);
		
		
		
	}

}

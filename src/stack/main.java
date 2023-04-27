package stack;

public class main {
	public static void main(String[] args) {
	Stack newStack = new Stack(88);
	
	newStack.getHeight();
	newStack.getTop();
	newStack.printStack();
	System.out.println();
	newStack.push(69);
	newStack.printStack();
	System.out.println();
	newStack.pop();
	newStack.printStack();
	newStack.pop();
	newStack.printStack();
 }
}

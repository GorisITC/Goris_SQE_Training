
public class Stack {
	final int length;
	int count = 0;
	String[] stack;	
	
	public Stack(int length) {
		if (length > 0) {
			this.length = length;
			stack = new String[this.length];
		} else {
			this.length = 5;
			stack = new String[this.length];
			System.out.println("Stack should have length more than 0, so I created your Stack with length 5.");
		}
	}
	
	public void push(String item) {
		if (isFull() == false) {
			stack[count] = item;
			count++;
		} else {
			System.out.println("Unfortunately, your Stack is full. You are not able to push new item.");
		}
	}
	
	public String pop() {
		if (isEmpty() == false) {
			String lastItem = stack[count-1];
			stack[count-1] = null;
			count--;
			return lastItem;
		} else {
			return "Your Stack is empty. You are not able to see and remove any Item.";
		}
	}
	
	public String peek() {
		if (isEmpty() == false) {
			return stack[count-1];
		} else {
			return "Your Stack is empty. Please, push something.";
		}
	}
	
	public boolean isEmpty() {
		return stack[0] == null;
	}
	
	public boolean isFull() {
		return stack[length - 1] != null;
	}
	
}
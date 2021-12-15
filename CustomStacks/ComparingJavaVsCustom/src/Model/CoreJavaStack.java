package Model;

import java.util.Stack;

public class CoreJavaStack {
    Stack<String> stack = new Stack<String>();

    public void push(String newItem) {
		stack.push(newItem);
	}
	
	public String pop() {
		return stack.pop();
	}
	
	public boolean contains(String item) {
		return stack.contains(item);
	}
	
	public String access(String item) {
		while(!stack.isEmpty()) {
			String tmpItem = pop();
			if(item.equals(tmpItem)) {
				return tmpItem;
			}
		}

		//if we didn't find the item in the stack throw an exception
		throw new IllegalArgumentException("Could not find item on the stack: " + item);
		
	}
	
	public int size() {
		return stack.size();
	}
}
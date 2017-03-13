package pkg;

public class MyStack {
	private int size;
	private int top = -1;
	private Object[] statckArray;

	public MyStack() {
		this.size = 10;
		statckArray = new Object[size];
	}

	public MyStack(int size) {
		this.size = size;
		statckArray = new Object[size];
	}

	public boolean push(Object obj) {
		boolean success = false;
		if (top < size - 1) {
			statckArray[top] = obj;
			top++;
			success = true;
		}
		return success;
	}

	public Object pop() {
		if (top > 0) {
			Object result = statckArray[top--];
			return result;
		}
		return null;
	}

	public Object peek() {
		if (top > 0) {
			return statckArray[top];
		}
		return null;
	}
}

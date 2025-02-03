package task6_II;

public class ArrayStack<T> implements StackInterface<T> {
	private T[] array;
	private int top;

	@SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
        top = -1;
    }
	
	@Override
	public T peek() {
		if(!isEmpty()) {
			return array[top--];
		}
		return null;
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (top == array.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = element;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		 if (!isEmpty()) {
	            return array[top--];  // Return the top element and decrement top
	        }
	        return null; 
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

}
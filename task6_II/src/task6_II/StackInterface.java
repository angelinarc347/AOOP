package task6_II;

public interface StackInterface<T> {
	void push(T element);
	T pop();
	T peek();
	boolean isEmpty();

}

package task6_I;

public interface MinMax<T extends Comparable<T>> {
	T min(T[] array);
	T max(T[] array);

}

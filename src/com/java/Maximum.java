package com.java;

public class Maximum<T extends Comparable<T>> {
	private T x, y, z;

	public Maximum(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0]; // assume a is initially the largest

		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		System.out.println("Maximum Value is= " + max);
		return max; // returns the largest value
	}

	// main method
	public static void main(String[] args) {
		// Calling method And passing values
		Maximum.<Integer>testMaximum(6, 7, 8, 9);

		Maximum.<Float>testMaximum(5.6f, 6.7f, 7.8f, 8.9f);

		Maximum.<String>testMaximum("Mango", "orange", "Banana", "Apple", "Grapes");
	}
}

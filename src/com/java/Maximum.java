package com.java;

public class Maximum {
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a; // assume a is initially the largest

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max; // returns the largest value
	}

	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.printf("the Max of the following %s , %s and %s is %s\n", a, b, c, max);
	}
}

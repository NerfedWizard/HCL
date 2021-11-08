package com.loel.java8;

import java.util.stream.IntStream;

public class StreamsTest {

	public static void main(String[] args) {
		// Integer Stream
		IntStream.range(1, 10).forEach(System.out::println);

		System.out.println();

		// Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

		System.out.println();
		System.out.println(IntStream.range(1, 5).sum());

	}

}

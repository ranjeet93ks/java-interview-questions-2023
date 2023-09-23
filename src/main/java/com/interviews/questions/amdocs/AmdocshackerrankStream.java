package com.interviews.questions.amdocs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmdocshackerrankStream {

	public static void main(String[] args) {
		int limit = 7;
		int sum = Stream.iterate(new int[] { 0, 1 }, x -> new int[] { x[1], x[0] + x[1] }).limit(limit).map(x -> x[0])
				.collect(Collectors.toList()).stream().distinct().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();

		System.out.println(sum);
		int limit1 = 8;
		int sum1 = Stream.iterate(new int[] { 0, 1 }, x -> new int[] { x[1], x[0] + x[1] }).limit(limit1).map(x -> x[0])
				.collect(Collectors.toList()).stream().distinct().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();

		System.out.println(sum1);
	}

}
